package io.github.kawajava.portiernia2023.admin.lecturer.controller.dto;


import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturerActivity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class AdminLecturerDto {
    @NotBlank
    @Length(min = 3)
    private String name;
    @NotBlank
    @Length(min = 3)
    private String surname;
    @Email
    private String email;
    @NotBlank
    @Length(min = 3, max = 5)
    private String abbreviation;
    private AdminLecturerActivity activity;
}
