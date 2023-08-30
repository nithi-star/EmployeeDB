package com.example.EmployeeDB.service;

import com.example.EmployeeDB.model.Employee;

import java.util.List;

public interface EmployeeService {
    public String createEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String employeeId);
    public Employee getEmployee(String employeeId);
    public List<Employee> getAllEmployee();
    List<Employee> getByEmployeeSorted();           //for sorting based on designation(3)

    //high performers(3)
    List<Employee> getTopPerformersLast3Months();



}
