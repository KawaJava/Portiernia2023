package io.github.kawajava.portiernia2023.user.lecturehall.controller;

import io.github.kawajava.portiernia2023.user.lecturehall.model.LectureHall;
import io.github.kawajava.portiernia2023.user.lecturehall.service.LectureHallService;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LectureHallController {

    private final LectureHallService lectureHallService;

    @GetMapping("/lecturehalls")
    public Page<LectureHall> getLectureHalls(@PageableDefault(size = 25) Pageable pageable) {
        return lectureHallService.getLectureHalls(pageable);
    }

    @GetMapping("/lecturehalls/{number}")
    public LectureHall getLectureHall(
            @PathVariable
            @Pattern(regexp = "[a-zA-Z0-9.]+")
            @Length(max = 10)
            String number) {
        return lectureHallService.getLecturerHallByName(number);
    }
}
