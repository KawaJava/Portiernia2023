package io.github.kawajava.portiernia2023.user.lecturehall.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LectureHall {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String number;
        private String activity;
        private LocalDate updated;

        @Override
        public boolean equals(Object object) {
                LectureHall lectureHall = (LectureHall) object;
                return this.number == lectureHall.number;
        }

        @Override
        public int hashCode() {
                return Objects.hash(number);
        }
}
