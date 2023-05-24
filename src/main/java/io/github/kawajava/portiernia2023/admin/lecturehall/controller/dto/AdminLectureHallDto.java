package io.github.kawajava.portiernia2023.admin.lecturehall.controller.dto;

import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHallActivity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class AdminLectureHallDto {
    @NotBlank
    @Length(min = 1, max = 10)
    private String number;
    private AdminLectureHallActivity activity;
}
