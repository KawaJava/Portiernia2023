package io.github.kawajava.portiernia2023.admin.lecturehall.controller;

import io.github.kawajava.portiernia2023.admin.lecturehall.controller.dto.AdminLectureHallDto;
import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHall;
import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHallActivity;
import io.github.kawajava.portiernia2023.admin.lecturehall.service.AdminLectureHallService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/lecturehalls")
public class AdminLectureHallController {

    private static final Long EMPTY_ID = null;
    private final AdminLectureHallService lectureHallService;

    @GetMapping
    public Page<AdminLectureHall> getLectureHalls(Pageable pageable) {
        return lectureHallService.getLectureHalls(pageable);
    }

    @GetMapping("/{id}")
    public AdminLectureHall getLectureHall(@PathVariable Long id) {
        return lectureHallService.getLectureHall(id);
    }

    @PostMapping
    public AdminLectureHall createLectureHall(@RequestBody @Valid AdminLectureHallDto adminLecturerDto) {
        return lectureHallService.createLectureHall(mapAdminLectureHall(adminLecturerDto, EMPTY_ID));
    }

    @PutMapping("/{id}")
    public AdminLectureHall updateLecturer(@RequestBody @Valid AdminLectureHallDto adminLectureHallDto,
                                        @PathVariable Long id) {
        return lectureHallService.updateLectureHall(mapAdminLectureHall(adminLectureHallDto, id));
    }

    @PatchMapping("/{id}/deactivate")
    public AdminLectureHall deactivateLecturer(@RequestBody @Valid AdminLectureHallDto adminLectureHallDto,
                                            @PathVariable Long id) {
        return lectureHallService.updateLectureHall(AdminLectureHall.builder()
                .id(id)
                .number(adminLectureHallDto.getNumber())
                .activity(AdminLectureHallActivity.valueOf("INACT"))
                .updated(LocalDate.now())
                .build());
    }

    @GetMapping("/active")
    public List<AdminLectureHall> getActiveLecturers() {
        return lectureHallService.getActiveLectureHalls();
    }

    @DeleteMapping("/{id}")
    public void deleteLecturer(@PathVariable Long id) {
        lectureHallService.deleteLectureHall(id);
    }

    private AdminLectureHall mapAdminLectureHall(AdminLectureHallDto adminLectureHallDto, Long id) {
        return AdminLectureHall.builder()
                .id(id)
                .number(adminLectureHallDto.getNumber())
                .activity(adminLectureHallDto.getActivity())
                .updated(LocalDate.now())
                .build();
    }

}
