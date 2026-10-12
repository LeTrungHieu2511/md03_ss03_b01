package com.example.session02.repository;

import com.example.session02.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {

    private final List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1L, "Lập trình Java cơ bản", "open", 1L));
        courses.add(new Course(2L, "Spring Boot nhập môn", "open", 1L));
        courses.add(new Course(3L, "Cơ sở dữ liệu", "closed", 2L));
    }

    public List<Course> findAll() {
        return courses;
    }
}