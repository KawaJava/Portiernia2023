package io.github.kawajava.portiernia2023.user.lecturer.controller;

import io.github.kawajava.portiernia2023.user.lecturer.model.Lecturer;
import io.github.kawajava.portiernia2023.user.lecturer.service.LecturerService;
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
public class LecturerController {

    private final LecturerService lecturerService;

    @GetMapping("/lecturers")
    public Page<Lecturer> getLecturers(@PageableDefault(size = 25) Pageable pageable) {
        return lecturerService.getLecturers(pageable);
    }

    @GetMapping("/lecturers/{abbreviation}")
    public Lecturer getLecturer(
            @PathVariable
            @Pattern(regexp = "[a-zA-Z0-9]+")
            @Length(max = 5)
            String abbreviation) {
        return lecturerService.getLecturerByAbbreviation(abbreviation);
    }
}
