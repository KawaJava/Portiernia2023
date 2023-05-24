package io.github.kawajava.portiernia2023.user.rental.controller;

import io.github.kawajava.portiernia2023.user.rental.controller.dto.RentalDto;
import io.github.kawajava.portiernia2023.user.rental.controller.dto.RentalKeysDto;
import io.github.kawajava.portiernia2023.user.rental.model.Rental;
import io.github.kawajava.portiernia2023.user.rental.service.RentalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rentals")
public class RentalController {

    private static final Long EMPTY_ID = null;
    private static final LocalTime EMPTY_TIME = null;
    private final RentalService rentalService;

    @GetMapping
    public Page<Rental> getRentals(Pageable pageable) {
        return rentalService.getRentals(pageable);
    }

    @GetMapping("/added")
    public List<Rental> getRentalsWithoutReturns() {
        return rentalService.getRentalsWithoutReturns();
    }

    @GetMapping("/late")
    public List<Rental> getRentalsBeforeDeadline() {
        return rentalService.getRentalsAfterDeadline();
    }

    @GetMapping("/{id}")
    public Rental getRental(@PathVariable Long id) {
        return rentalService.getRental(id);
    }

    @PostMapping
    public Rental createRental(@RequestBody @Valid RentalDto rentalDto) {
        return rentalService.createRental(mapRental(rentalDto, EMPTY_ID, EMPTY_TIME));
    }

    @PutMapping("/{id}/getkeys")
    public Rental updateRentalByGettingKeys(@PathVariable Long id,
                                            @RequestBody @Valid RentalKeysDto rentalKeysDto) {
        return rentalService.updateLRental(Rental.builder()
                .id(id)
                .date(rentalKeysDto.getDate())
                .releaseTime(rentalKeysDto.getReleaseTime())
                .returnTime(LocalTime.now())
                .deadlineTime(rentalKeysDto.getDeadlineTime())
                .notification(rentalKeysDto.getNotification())
                .lecturerId(rentalKeysDto.getLecturerId())
                .lectureHallId(rentalKeysDto.getLectureHallId())
                .build());
    }

    private Rental mapRental(RentalDto rentalDto, Long id, LocalTime time) {
        return Rental.builder()
                .id(id)
                .date(LocalDate.now())
                .releaseTime(LocalTime.now())
                .returnTime(time)
                .deadlineTime(rentalDto.getDeadlineTime())
                .notification(0)
                .lecturerId(rentalDto.getLecturerId())
                .lectureHallId(rentalDto.getLectureHallId())
                .build();
    }

}
