package com.education.teacherapp.web.service;


import com.education.teacherapp.model.Teacher;
import com.education.teacherapp.web.repository.TeacherInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {


      @Autowired
      private TeacherInterface teacherInterface;

      public Teacher saveTeacher(Teacher teacher){

            return teacherInterface.save(teacher);
      }

      public void saveAll(List<Teacher> teachers) {
            teacherInterface.saveAll(teachers);
      }


      public List<Teacher> findAll(){
            return teacherInterface.findAll();
      }
}
