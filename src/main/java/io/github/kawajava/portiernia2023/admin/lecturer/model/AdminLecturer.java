package io.github.kawajava.portiernia2023.admin.lecturer.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "lecturer")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminLecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String abbreviation;
    @Enumerated(EnumType.STRING)
    private AdminLecturerActivity activity;
    private LocalDate created;
}
