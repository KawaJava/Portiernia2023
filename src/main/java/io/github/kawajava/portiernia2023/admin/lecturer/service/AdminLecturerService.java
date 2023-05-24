package io.github.kawajava.portiernia2023.admin.lecturer.service;

import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturer;
import io.github.kawajava.portiernia2023.admin.lecturer.model.AdminLecturerActivity;
import io.github.kawajava.portiernia2023.admin.lecturer.repository.AdminLecturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminLecturerService {

    private final AdminLecturerRepository adminLecturerRepository;

    public Page<AdminLecturer> getLecturers(Pageable pageable) {
        return adminLecturerRepository.findAll(pageable);
    }

    public AdminLecturer getLecturer(Long id) {
        return adminLecturerRepository.findById(id).orElseThrow();
    }

    public AdminLecturer createLecturer(AdminLecturer product) {
        return adminLecturerRepository.save(product);
    }

    public AdminLecturer updateLecturer(AdminLecturer product) {
        return adminLecturerRepository.save(product);
    }


    public List<AdminLecturer> getActiveLecturers() {
        return adminLecturerRepository.findAll().stream()
                .filter(Lecturer -> Lecturer.getActivity().equals(AdminLecturerActivity.ACT))
                .collect(Collectors.toList());
    }
    public void deleteLecturer(Long id) {
        adminLecturerRepository.deleteById(id);
    }

}
