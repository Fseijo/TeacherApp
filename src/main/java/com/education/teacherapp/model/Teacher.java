package com.education.teacherapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

      @Id @GeneratedValue(strategy = GenerationType.AUTO)
      private Integer id;
      private String firstName;
      private String lastName;
      private String email;

      @OneToMany
      private List<ClassRoom> classRooms;



//      Constructeur par défaut
      public Teacher(){

      }


//      Constructeur par surchargé

      public Teacher(Integer id, String firstName, String lastName, String email, List<ClassRoom> classRooms) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.classRooms = classRooms;
      }


      public Integer getId() {
            return id;
      }

      public void setId(Integer id) {
            this.id = id;
      }

      public String getFirstName() {
            return firstName;
      }

      public void setFirstName(String firstName) {
            this.firstName = firstName;
      }

      public String getLastName() {
            return lastName;
      }

      public void setLastName(String lastName) {
            this.lastName = lastName;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public List<ClassRoom> getClassRooms() {
            return classRooms;
      }

      public void setClassRooms(List<ClassRoom> classRooms) {
            this.classRooms = classRooms;
      }


      @Override
      public String toString() {
            return "Teacher{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", classRooms=" + classRooms + '}';
      }
}


