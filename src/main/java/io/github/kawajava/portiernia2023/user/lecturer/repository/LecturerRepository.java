package io.github.kawajava.portiernia2023.user.lecturer.repository;

import io.github.kawajava.portiernia2023.user.lecturer.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
    Optional<Lecturer> findByAbbreviation(String abbreviation);
}
