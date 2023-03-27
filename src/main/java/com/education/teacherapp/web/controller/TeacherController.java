package com.education.teacherapp.web.controller;

import com.education.teacherapp.model.Teacher;
import com.education.teacherapp.web.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class TeacherController {

      @Autowired
      private TeacherService teacherService;


      @PostMapping("/addTeacher")
      public Teacher postDetails(@RequestBody Teacher teacher){
          return teacherService.saveTeacher(teacher);
      }


      @PostMapping(value = "/addTeachersList")
      public void  ajouterListTeachers(@RequestBody List<Teacher> teachers) {
            teacherService.saveAll(teachers);
      }

      @GetMapping("/TeachersList")
      public List<Teacher> listeTeachers(){
            return teacherService.findAll();
      }
}
