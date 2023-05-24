package io.github.kawajava.portiernia2023.user.rental.service;

import io.github.kawajava.portiernia2023.user.rental.model.Rental;
import io.github.kawajava.portiernia2023.user.rental.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RentalService {

    private final RentalRepository rentalRepository;

    public Page<Rental> getRentals(Pageable pageable) {
        return rentalRepository.findAll(pageable);
    }

    public Rental getRental(Long id) {
        return rentalRepository.findById(id).orElseThrow();
    }

    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateLRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public List<Rental> getRentalsWithoutReturns() {
        return rentalRepository.findAll().stream()
                .filter(Rental -> Rental.getReturnTime() == null)
                .collect(Collectors.toList());
    }

    public List<Rental> getRentalsAfterDeadline() {
        return rentalRepository.findAll().stream()
                .filter(Rental -> Rental.getReturnTime() == null)
                .filter(Rental -> Rental.getDeadlineTime().isBefore(LocalTime.now()))
                .collect(Collectors.toList());
    }
}
