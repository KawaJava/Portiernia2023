package io.github.kawajava.portiernia2023.user.lecturehall.repository;

import io.github.kawajava.portiernia2023.user.lecturehall.model.LectureHall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LectureHallRepository extends JpaRepository<LectureHall, Long> {
    Optional<LectureHall> findByNumber(String number);
}
