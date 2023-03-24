package com.education.teacherapp.web.repository;

import com.education.teacherapp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherInterface extends JpaRepository<Teacher, Integer> {
      Teacher findById(int id);
}
