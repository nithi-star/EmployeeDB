package com.example.EmployeeDB.service.impl;


import com.example.EmployeeDB.exception.EmployeeNotFoundException;
import com.example.EmployeeDB.model.Employee;
import com.example.EmployeeDB.repository.EmployeeRepository;
import com.example.EmployeeDB.service.EmployeeService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee(Employee employee) {
        //More Business Logic
        employeeRepository.save(employee);
        return "Success";
    }

    @Override
    public String updateEmployee(Employee employee) {
        //More Business Logic
        employeeRepository.save(employee);
        return "Success";
    }

    @Override
    public String deleteEmployee(String employeeId) {
        //More Business Logic
        employeeRepository.deleteById(employeeId);
        return "Success";
    }

    @Override
    public Employee getEmployee(String employeeId) {
        //More Business Logic
        if(employeeRepository.findById(employeeId).isEmpty())
            throw new EmployeeNotFoundException("Requested Employee does not exist");
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        //More Business Logic
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getByEmployeeSorted(){                //for sorting based on designation(2)
        Sort sort = Sort.by(Sort.Direction.ASC,"designation");
        return employeeRepository.findAll(sort);
    }

    //high performers(2)
    public List<Employee> getTopPerformersLast3Months() {
        Date threeMonthsAgo = new Date(System.currentTimeMillis() - (90L * 24L * 3600L * 1000L)); // 90 days in milliseconds
        return employeeRepository.findTopPerformersLast3Months(threeMonthsAgo);
    }


}
