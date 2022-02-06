package com.goodlikemax.AllEmployees.controller;

import com.goodlikemax.AllEmployees.domain.Employee;
import com.goodlikemax.AllEmployees.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * "Created by : goodlikemax"
 * "Date: "05.02.2022
 */
@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public Iterable<Employee> list(){
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable long id){
        return employeeRepository.findById(id);
    }



    @PostMapping
    public Employee create(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    @PutMapping("{id}")
    public Employee update(@RequestBody Employee employee){

        return employee;
    }


}
