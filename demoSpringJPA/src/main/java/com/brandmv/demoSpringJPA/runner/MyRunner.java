package com.brandmv.demoSpringJPA.runner;

import com.brandmv.demoSpringJPA.model.Employee;
import com.brandmv.demoSpringJPA.service.IEmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private IEmployeeService employeeService;
    @Override
    public void run(String...args) throws Exception{
        employeeService.save(new Employee("Brandon", "Meza", "brandon@gmail.com"));
        employeeService.save(new Employee("David", "Vargas", "david@gmail.com"));
        employeeService.save(new Employee("Mario", "Hernandez", "mario@gmail.com"));
        employeeService.save(new Employee("Jonathan", "Guzman", "jonathan@gmail.com"));
       //employeeService.save(new Employee("Lizeth", "Gonzalez", "lizeth@gmail.com"));


        long id1 = 1L;
        employeeService.findById(id1).ifPresent(System.out::println);

        long id2 = 5L;
        Optional<Employee> optional = employeeService.findById(id2);

        if(optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.printf("No employee found width id %d%n", id2);

        //get list of employees
        List<Employee> employees = employeeService.findAll();
        employees.forEach(employee -> System.out.println(employee.toString()));

        //*delete employee by id
        employeeService.delete(3L);
        employeeService.delete(2L);

    }
}
