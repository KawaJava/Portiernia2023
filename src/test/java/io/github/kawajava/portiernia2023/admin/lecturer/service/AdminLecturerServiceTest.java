package io.github.kawajava.portiernia2023.admin.lecturer.service;

import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturer;
import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturerActivity;
import io.github.kawajava.portiernia2023.admin.lecturer.repository.AdminLecturerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AdminLecturerServiceTest {

    private AdminLecturerActivity ACT = AdminLecturerActivity.ACT;
    private AdminLecturerActivity INACT = AdminLecturerActivity.INACT;

    @Mock
    private AdminLecturerRepository adminLecturerRepository;

    @InjectMocks
    private AdminLecturerService adminLecturerService;

    @BeforeEach
    void setUp() {
        when(adminLecturerRepository.findAll()).thenReturn(Arrays.asList(
                new AdminLecturer(1L, "Jan", "Kowalski","email1@email.com",
                        "JKow", ACT, LocalDate.of(2023, 4, 24)),
                new AdminLecturer(2L, "Jan", "Nowak","email2@email.com",
                        "JNow", INACT, LocalDate.of(2023, 4, 25))
        ));
    }
    @Test
    void shouldGetActiveLecturers() {
        // when
        List<AdminLecturer> lecturers = adminLecturerService.getActiveLecturers();
        // then
        assertThat(lecturers).hasSize(1);
    }
}