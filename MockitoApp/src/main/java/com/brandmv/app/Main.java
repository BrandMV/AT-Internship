package com.brandmv.app;

import com.brandmv.app.models.Student;
import com.brandmv.app.repositories.IStudentRepository;
import com.brandmv.app.repositories.StudentRepositoryImpl;
import com.brandmv.app.services.IStudentService;
import com.brandmv.app.services.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        //*Injecting class we wanna use in service
        IStudentRepository repository = new StudentRepositoryImpl();
        IStudentService service = new StudentServiceImpl(repository);
        Student student = service.searchStudentByNameLastname("Brandon", "Meza");
        System.out.println("Student found: " + student);

    }
}
