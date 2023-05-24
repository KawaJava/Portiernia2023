package io.github.kawajava.portiernia2023.user.lecturer.service;

import io.github.kawajava.portiernia2023.user.lecturer.model.Lecturer;
import io.github.kawajava.portiernia2023.user.lecturer.repository.LecturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
@Validated
public class LecturerService {

    private final LecturerRepository lecturerRepository;

    public Page<Lecturer> getLecturers(Pageable pageable) {
        return lecturerRepository.findAll(pageable);
    }

    public Lecturer getLecturerByAbbreviation(String abbreviation) {
        return lecturerRepository.findByAbbreviation(abbreviation).orElseThrow();
    }
}
