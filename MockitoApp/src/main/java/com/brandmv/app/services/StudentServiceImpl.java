package com.brandmv.app.services;

import com.brandmv.app.models.Student;
import com.brandmv.app.repositories.IStudentRepository;
import com.brandmv.app.repositories.StudentRepositoryImpl;

import java.util.NoSuchElementException;
import java.util.Optional;

public class StudentServiceImpl implements IStudentService{

    //*
    private IStudentRepository repository;

    //
    public StudentServiceImpl(IStudentRepository repository){
        this.repository = repository;
    }

    @Override
    public Student searchStudentByNameLastname(String name, String lastname) {

        //*Filtering a student from the list
        //* Findfirst returns an optional value so we save it in an optional variable of student

        Optional<Student> studentOptional = null;
        try {
            studentOptional = this.repository.getAllStudents().stream().filter(s -> s.getName().equals(name) && s.getLastname().equals(lastname)).findFirst();
            Student student = null;
            //*If exists the student value
            if(studentOptional.isPresent()){
                student = studentOptional.get(); //* get returns the alumn if exists
            }else{
                throw new NoSuchElementException("Student does not exist");
            }
            return student;
        } catch (NullPointerException ex) {
            throw new NullPointerException("List does not contain data");
        }

    }
}
