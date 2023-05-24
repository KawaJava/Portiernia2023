package io.github.kawajava.portiernia2023.user.rental.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime releaseTime;
    private LocalTime returnTime;
    private LocalTime deadlineTime;
    private int notification;
    private int lecturerId;
    private int lectureHallId;

}
