package io.github.kawajava.portiernia2023.admin.lecturer.controller;

import io.github.kawajava.portiernia2023.admin.lecturer.controller.dto.AdminLecturerDto;
import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturer;
import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturerActivity;
import io.github.kawajava.portiernia2023.admin.lecturer.service.AdminLecturerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/lecturers")
public class AdminLecturerController {

    private static final Long EMPTY_ID = null;
    private final AdminLecturerService adminLecturerService;

    @GetMapping
    public Page<AdminLecturer> getLecturers(Pageable pageable) {
        return adminLecturerService.getLecturers(pageable);
    }

    @GetMapping("/{id}")
    public AdminLecturer getLecturer(@PathVariable Long id) {
        return adminLecturerService.getLecturer(id);
    }

    @PostMapping
    public AdminLecturer createLecturer(@RequestBody @Valid AdminLecturerDto adminLecturerDto) {
        return adminLecturerService.createLecturer(mapAdminLecturer(adminLecturerDto, EMPTY_ID));
    }

    @PutMapping("/{id}")
    public AdminLecturer updateLecturer(@RequestBody @Valid AdminLecturerDto adminLecturerDto,
                                      @PathVariable Long id) {
        return adminLecturerService.updateLecturer(mapAdminLecturer(adminLecturerDto, id));
    }

    @PatchMapping("/{id}/deactivate")
    public AdminLecturer deactivateLecturer(@RequestBody @Valid AdminLecturerDto adminLecturerDto,
                                            @PathVariable Long id) {
        return adminLecturerService.updateLecturer(AdminLecturer.builder()
                .id(id)
                .name(adminLecturerDto.getName())
                .surname(adminLecturerDto.getSurname())
                .email(adminLecturerDto.getEmail())
                .abbreviation(adminLecturerDto.getAbbreviation())
                .activity(AdminLecturerActivity.valueOf("INACT"))
                .created(LocalDate.now())
                .build());
    }

    @GetMapping("/active")
    public List<AdminLecturer> getActiveLecturers() {
        return adminLecturerService.getActiveLecturers();
    }

    @DeleteMapping("/{id}")
    public void deleteLecturer(@PathVariable Long id) {
        adminLecturerService.deleteLecturer(id);
    }

    private AdminLecturer mapAdminLecturer(AdminLecturerDto adminLecturerDto, Long id) {
        return AdminLecturer.builder()
                .id(id)
                .name(adminLecturerDto.getName())
                .surname(adminLecturerDto.getSurname())
                .email(adminLecturerDto.getEmail())
                .abbreviation(adminLecturerDto.getAbbreviation())
                .activity(adminLecturerDto.getActivity())
                .created(LocalDate.now())
                .build();
    }

}
