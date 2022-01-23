package com.goodlikemax.AllEmployees.controller;


import com.goodlikemax.AllEmployees.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * "Created by : goodlikemax"
 * "Date: "22.01.2022
 */

@RestController
public class Main {

    Employee employee = new Employee(1565866841,"Vilalii Zal","Streamer", 1212121212121L, "+3806090609",100000);

    @GetMapping("/")
    public String get() {
        return employee.toString();
    }

}
