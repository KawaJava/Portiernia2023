package io.github.kawajava.portiernia2023.user.lecturer.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class LecturerTest {

    private final String ACT = "ACT";

    Lecturer lecturer1 = new Lecturer
            (1L, "Jan", "Kowalski","email1@email.com", "JKow",
                    ACT, LocalDate.of(2023, 4, 24));
    Lecturer lecturer2 = new Lecturer
            (2L, "Jan", "Nowak","email2@email.com", "JNow",
                    ACT, LocalDate.of(2023, 4, 25));
    Lecturer lecturer3 = new Lecturer
            (2L, "Jan", "Kowalski","email1@email.com", "JKow",
                    ACT, LocalDate.of(2023, 4, 24));

    @Test
    void shouldEqualLecturers() {

        assertThat(lecturer1).isEqualTo(lecturer3);
        assertThat(lecturer1).isNotEqualTo(lecturer2);

    }

    @Test
    void shouldHashLecturers() {

        assertThat(lecturer1.hashCode()).isEqualTo(lecturer3.hashCode());
        assertThat(lecturer1.hashCode()).isNotEqualTo(lecturer2.hashCode());

    }
}