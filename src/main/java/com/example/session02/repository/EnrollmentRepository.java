package com.example.session02.repository;

import com.example.session02.model.Enrollment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EnrollmentRepository {

    private final List<Enrollment> enrollments = new ArrayList<>();

    public EnrollmentRepository() {
        enrollments.add(new Enrollment(1L, "Lê Minh Cường", 1L));
        enrollments.add(new Enrollment(2L, "Phạm Thu Dung", 1L));
        enrollments.add(new Enrollment(3L, "Hoàng Gia Huy", 2L));
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }
}
