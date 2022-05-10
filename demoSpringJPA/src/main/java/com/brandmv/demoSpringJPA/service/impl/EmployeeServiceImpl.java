package com.brandmv.demoSpringJPA.service.impl;

import com.brandmv.demoSpringJPA.model.Employee;
import com.brandmv.demoSpringJPA.repository.EmployeeRepository;
import com.brandmv.demoSpringJPA.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        employeeRepository.deleteById(id);
    }
}
