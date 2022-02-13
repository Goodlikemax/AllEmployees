package com.goodlikemax.AllEmployees.repo;


import com.goodlikemax.AllEmployees.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * "Created by : goodlikemax"
 * "Date: "23.01.2022
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  Employee findById(long id);
  Employee findByFullName(String fullName);

}
