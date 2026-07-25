package com.cognizant.ormlearn2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn2.model.Employee;
import com.cognizant.ormlearn2.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployeesByName(String name) {
        // Invokes our custom exact-match query operation
        return employeeRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public List<Employee> searchEmployeesByKeyword(String keyword) {
        // Invokes our custom pattern-matching operation
        return employeeRepository.findByNameContaining(keyword);
    }
}
