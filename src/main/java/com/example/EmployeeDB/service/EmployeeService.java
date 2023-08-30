package com.example.EmployeeDB.service;

import com.example.EmployeeDB.model.Employee;

import java.util.List;

public interface EmployeeService {
    public String createEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String employeeId);
    public Employee getEmployee(String employeeId);
    public List<Employee> getAllEmployee();

    //for sorting based on designation
    List<Employee> getByEmployeeSorted();

    //to get the high performers
    List<Employee> getTopPerformersLast3Months();



}
