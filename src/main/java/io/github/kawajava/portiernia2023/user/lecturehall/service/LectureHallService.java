package io.github.kawajava.portiernia2023.user.lecturehall.service;

import io.github.kawajava.portiernia2023.user.lecturehall.model.LectureHall;
import io.github.kawajava.portiernia2023.user.lecturehall.repository.LectureHallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
@Validated
public class LectureHallService {

    private final LectureHallRepository lectureHallRepository;

    public Page<LectureHall> getLectureHalls(Pageable pageable) {
        return lectureHallRepository.findAll(pageable);
    }

    public LectureHall getLecturerHallByName(String number) {
        return lectureHallRepository.findByNumber(number).orElseThrow();
    }
}
