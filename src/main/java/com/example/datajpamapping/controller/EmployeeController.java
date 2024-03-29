package com.example.datajpamapping.controller;

import com.example.datajpamapping.entity.Employee;
import com.example.datajpamapping.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody List<Employee> empData) {
        employeeRepository.saveAll(empData);
        return ResponseEntity.ok("Data Saved");
    }
}
