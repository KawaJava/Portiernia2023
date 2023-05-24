package io.github.kawajava.portiernia2023.user.lecturer.model;

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
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String abbreviation;
    private String activity;
    private LocalDate created;

    @Override
    public boolean equals(Object object) {
        Lecturer lecturer  = (Lecturer) object;
        return this.abbreviation == lecturer.abbreviation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(abbreviation);
    }

}
