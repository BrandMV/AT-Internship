package com.brandmv.app.dummy;

import com.brandmv.app.models.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDummy {
    public static List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(1L, "Jonathan", "Hernandez", "Sistemas"),
                new Student(2L, "Lizeth", "Gonzalez", "Arquitectura"),
                new Student(3L, "Brandon", "Meza", "Diseño"));
    }

    public static List<Student> getAllStudentsEmptyList(){
        return Collections.emptyList();
    }
}
