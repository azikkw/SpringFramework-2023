package com.example.swaggersample.controller;

import com.example.swaggersample.model.Employee;
import com.example.swaggersample.model.EmployeeRepository;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(description = "EmployeeController", name = "Employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Hidden
    @PostMapping("/employees")
    Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    @Operation(summary = "findAll employees")
    List<Employee> all() {
        return employeeRepository.findAll();
    }

//    @GetMapping("/employees")
//    Page<Employee> getAllEmployees(@ParameterObject Pageable pageable) {
//        return null;
//    }

}