package com.education.teacherapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ClassRoom {
      @Id
      private Integer id;
      private String classroomNumber;

      @ManyToOne
      private Teacher teacher;


      public ClassRoom() {

      }

      public ClassRoom(Integer id, String classroomNumber) {
            this.id = id;
            this.classroomNumber = classroomNumber;
      }


      public Integer getId() {
            return id;
      }

      public void setId(Integer id) {
            this.id = id;
      }

      public String getClassroomNumber() {
            return classroomNumber;
      }

      public void setClassroomNumber(String classroomNumber) {
            this.classroomNumber = classroomNumber;
      }


      @Override
      public String toString() {
            return "ClassRoom{" + "id=" + id + ", classroomNumber='" + classroomNumber + '\'' + '}';
      }
}
