package io.github.kawajava.portiernia2023.user.rental.controller.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
public class RentalKeysDto {
    private LocalDate date;
    private LocalTime releaseTime;
    private LocalTime returnTime;
    private LocalTime deadlineTime;
    private int notification;
    private int lecturerId;
    private int lectureHallId;
}
