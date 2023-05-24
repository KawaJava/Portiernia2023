package io.github.kawajava.portiernia2023.admin.lecturehall.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "lecture_hall")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminLectureHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @Enumerated(EnumType.STRING)
    private AdminLectureHallActivity activity;
    private LocalDate updated;
}
