package io.github.kawajava.portiernia2023.user.rental.controller.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalTime;

@Getter
public class RentalDto {
    private LocalTime returnTime;
    private LocalTime deadlineTime;
    @NotNull
    private int lecturerId;
    @NotNull
    private int lectureHallId;
}
