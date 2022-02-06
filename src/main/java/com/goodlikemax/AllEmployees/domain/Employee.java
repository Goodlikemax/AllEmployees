package com.goodlikemax.AllEmployees.domain;







import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * "Created by : goodlikemax"
 * "Date: "22.01.2022
 */

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String position;
    private Date hiringDate;
    private String phoneNumber;
    private int salary;

    @JoinColumn
    @OneToMany(fetch = FetchType.EAGER)
    private List<Employee> subordinates;

    public void addSubordinates(Employee employee){
        subordinates.add(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    private int subordinationLevel;

    private Date createdAt;
    private Date updatedAt;
    private long adminCreatedId;
    private long adminUpdatedId;

    public Employee() {
    }



    public Employee( String fullName, String position, long hiringDate, String phoneNumber, int salary) {
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

    public Long getId() {
        return id;
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


    public void setId(Long id) {
        this.id = id;
    }


}
