package com.brandmv.app.repositories;

import com.brandmv.app.models.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> getAllStudents();
    //Student getStudentByNameLastname(String name, String lastname);


}
