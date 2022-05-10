package com.brandmv.demoSpringJPA.service;

import com.brandmv.demoSpringJPA.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee employee);
    Optional <Employee> findById(Long id);

    void delete(long id);
}
