package com.goodlikemax.AllEmployees.domain;


import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import java.util.Date;

/**
 * "Created by : goodlikemax"
 * "Date: "22.01.2022
 */
public class Employee {

    @Id
    private long id;
    private String fullName;
    private String position;
    private Date hiringDate;
    private String phoneNumber;
    private int salary;
    private Employee head;

    private int subordinationLevel;

    private Date createdAt;
    private Date updatedAt;
    private long adminCreatedId;
    private long adminUpdatedId;


    public Employee(long id, String fullName, String position, long hiringDate, String phoneNumber, int salary, Employee head) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.hiringDate = new Date(hiringDate);
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.head = head;

        this.createdAt = new Date();
    }

    public Employee(long id, String fullName, String position, long hiringDate, String phoneNumber, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.hiringDate = new Date(hiringDate);
        this.phoneNumber = phoneNumber;
        this.salary = salary;

        this.createdAt = new Date();
    }

    public int getSubordinationLevel() {
        return subordinationLevel;
    }

    public void setSubordinationLevel(int subordinationLevel) {
        this.subordinationLevel = subordinationLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", hiringDate=" + hiringDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", subordinationLevel=" + subordinationLevel +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", adminCreatedId=" + adminCreatedId +
                ", adminUpdatedId=" + adminUpdatedId +
                '}';
    }
}
