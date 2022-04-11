package com.brandmv.app.repositories;

import com.brandmv.app.models.Student;

import java.util.Arrays;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository{

    @Override
    public List<Student> getAllStudents() {
        System.out.println("getAllStudents method from the class " + getClass().getSimpleName()  + "was invoked");
        return Arrays.asList(
                new Student(1L, "Brandon", "Meza", "Sistemas"),
                new Student(2L, "Lizeth", "Gonzalez", "Arquitectura"),
                new Student(3L, "Jonathan", "Hernandez", "Diseño"));
    }

    /*@Override
    public Student getStudentByNameLastname(String name, String lastname) {
        return null;
    }*/
}
