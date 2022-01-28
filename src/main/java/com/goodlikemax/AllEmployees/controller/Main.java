package com.goodlikemax.AllEmployees.controller;


import com.goodlikemax.AllEmployees.domain.Employee;
import com.goodlikemax.AllEmployees.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * "Created by : goodlikemax"
 * "Date: "22.01.2022
 */

@RestController
public class Main {

    @Autowired
    private EmployeeRepository employeeRepository;



    @GetMapping("/")
    public String get() {
        Iterable<Employee> allEmployeeList = employeeRepository.findAll();

        return allEmployeeList.toString();
    }

    @GetMapping("/add")
    public String add(){
        employeeRepository.save(new Employee("Vilalii Zal","Streamer", 1212121212121L, "+3806090609",100000));
        return "success";
    }

}
