package com.goodlikemax.AllEmployees.controller;

import com.goodlikemax.AllEmployees.domain.Employee;
import com.goodlikemax.AllEmployees.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * "Created by : goodlikemax"
 * "Date: "06.02.2022
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private EmployeeRepository er;

    @GetMapping("add")
    public Iterable<Employee> start(){
        er.save(new Employee("vasilii tasd","strem", 1212121212121L,"15465683" ,50000));
        er.save(new Employee("q","stewr", 1212121212121L,"12346786" ,20000));
        er.save(new Employee("w","tyhb", 1212121212121L,"123456775" ,30000));
        er.save(new Employee("e","ssdfm", 1212121212121L,"123467835" ,40000));
        er.save(new Employee("r","skiolm", 1212121212121L,"19687635" ,60000));
        er.save(new Employee("t","trol", 1212121212121L,"445646135" ,70000));
        er.save(new Employee("y","tirol", 1212121212121L,"112345" ,80000));


        Employee head = new Employee("Head","And Shoulders", 1212122222121L,"7777" ,180000);
        head.setSubordinates(
                StreamSupport.stream(Spliterators.spliteratorUnknownSize(er.findAll().iterator(), Spliterator.ORDERED), false)
                        .collect(Collectors.toList()));


        er.save(head);


        return er.findAll();
    }



//       employeeRepository.save(new Employee(fullName,position, 1212121212121L, phoneNumber,salary));
}
