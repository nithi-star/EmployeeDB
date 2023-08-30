package com.example.EmployeeDB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.time.LocalDate;

@Entity
@Table(name="emp_details")
public class Employee {
    @Id
    private String id;
    private String name;
    private String designation;
    private float starRating;
    private Date joindate;

    public Employee() {
    }

    public Employee(String id, String name, String designation, float starRating, Date joindate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.starRating = starRating;
        this.joindate = joindate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoinDate(Date joindate) {
        this.joindate = joindate;
    }
}
