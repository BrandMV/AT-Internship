package com.brandmv.app.services;

import com.brandmv.app.models.Student;

public interface IStudentService {
    Student searchStudentByNameLastname(String name, String lastname);
}
