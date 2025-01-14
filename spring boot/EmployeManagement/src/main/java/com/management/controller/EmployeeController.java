package com.management.controller;

import com.management.entity.Employee;
import com.management.repository.EmployeeRepository;
import com.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee()
    {
        return  employeeService.getAllEmployee();
    }
    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee)
    {
        employeeService.createEmployee(employee);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee)
    {
        Optional<Employee> employee1= employeeRepository.findById(id);
        if(employee1.isPresent())
        {
            Employee em= employee1.get();
            em.setName(employee.getName());
            em.setProfile(employee.getProfile());
            em.setExperience(employee.getExperience());
            employeeService.updateEmployee(em);
            return  ResponseEntity.status(HttpStatus.OK).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id)
    {
        Optional<Employee> employee1= employeeRepository.findById(id);
        if(employee1.isPresent()) {
            employeeService.deleteEmployee(id);
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
