package com.example.session02.repository;

import com.example.session02.model.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {

    private final List<Instructor> instructors = new ArrayList<>();

    public InstructorRepository() {
        instructors.add(new Instructor(1L, "Nguyễn Văn An", "an@example.com"));
        instructors.add(new Instructor(2L, "Trần Thị Bình", "binh@example.com"));
    }

    public List<Instructor> findAll() {
        return instructors;
    }
}