package com.education.teacherapp.web.controller;

import com.education.teacherapp.web.repository.TeacherInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

      @Autowired
      private TeacherInterface teacherInterface;

//      Récuperer la liste

//@GetMapping("/Teacher")
//      public


}
