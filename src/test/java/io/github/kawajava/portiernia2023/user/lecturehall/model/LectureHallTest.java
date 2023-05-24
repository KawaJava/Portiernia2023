package io.github.kawajava.portiernia2023.user.lecturehall.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class LectureHallTest {

    private final String ACT = "ACT";

    LectureHall lectureHall1 = new LectureHall
            (1L, "1", ACT, LocalDate.of(2023, 4, 24));
    LectureHall lectureHall2 = new LectureHall
            (2L, "2", ACT, LocalDate.of(2023, 4, 25));
    LectureHall lectureHall3 = new LectureHall
            (1L, "1", ACT, LocalDate.of(2023, 4, 24));

    @Test
    void shouldEqualLectureHalls() {

        assertThat(lectureHall1).isEqualTo(lectureHall3);
        assertThat(lectureHall1).isNotEqualTo(lectureHall2);

    }

    @Test
    void shouldHashLectureHalls() {

        assertThat(lectureHall1.hashCode()).isEqualTo(lectureHall3.hashCode());
        assertThat(lectureHall1.hashCode()).isNotEqualTo(lectureHall2.hashCode());

    }

}