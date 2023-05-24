package io.github.kawajava.portiernia2023.admin.lecturehall.service;

import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHall;
import io.github.kawajava.portiernia2023.admin.lecturehall.model.AdminLectureHallActivity;
import io.github.kawajava.portiernia2023.admin.lecturehall.repository.AdminLectureHallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminLectureHallService {

    private final AdminLectureHallRepository lectureHallRepository;

    public Page<AdminLectureHall> getLectureHalls(Pageable pageable) {
        return lectureHallRepository.findAll(pageable);
    }

    public AdminLectureHall getLectureHall(Long id) {
        return lectureHallRepository.findById(id).orElseThrow();
    }

    public AdminLectureHall createLectureHall(AdminLectureHall product) {
        return lectureHallRepository.save(product);
    }

    public AdminLectureHall updateLectureHall(AdminLectureHall product) {
        return lectureHallRepository.save(product);
    }

    public List<AdminLectureHall> getActiveLectureHalls() {
        return lectureHallRepository.findAll().stream()
                .filter(LectureHall -> LectureHall.getActivity().equals(AdminLectureHallActivity.ACT))
                .collect(Collectors.toList());
    }
    public void deleteLectureHall(Long id) {
        lectureHallRepository.deleteById(id);
    }
}
