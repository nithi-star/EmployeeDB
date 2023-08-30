package com.example.EmployeeDB.controller;

import com.example.EmployeeDB.model.Employee;
import com.example.EmployeeDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("{id}")
    public Employee getEmployeeDetails(@PathVariable("id") String id){
        return employeeService.getEmployee(id);
    }
    @GetMapping()
    public List<Employee> getEmployeeDetails(){
        return employeeService.getAllEmployee();
    }
    @PostMapping
    public String createEmployeeDetails(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return "Employee details created successfully";
    }
    @PutMapping
    public String updateEmployeeDetails(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return "Employee details updated successfully";
    }
    @DeleteMapping("{id}")
    public String deleteEmployeeDetails(@PathVariable("id") String id){
        employeeService.deleteEmployee(id);
        return "Employee detail deleted successfully";
    }
    @GetMapping("/sorted")              //for sorting based on designation(4)
    public List<Employee> getEmployeeByDesignation(){
        return employeeService.getByEmployeeSorted();
    }

    //high performers(4)
    @GetMapping("/topPerformers")
    public List<Employee> getTopPerformers() {
        return employeeService.getTopPerformersLast3Months();
    }


}
