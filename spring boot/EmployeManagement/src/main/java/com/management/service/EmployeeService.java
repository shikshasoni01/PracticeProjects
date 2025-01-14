package com.management.service;

import com.management.entity.Employee;
import com.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee()
    {
        return  employeeRepository.findAll();

    }

    public void createEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    public void updateEmployee( Employee employee)
    {
            employeeRepository.save(employee);

    }
    public  void deleteEmployee(long id)
    {
        employeeRepository.deleteById(id);
    }

    }
