package com.example.EmployeeDB.repository;

import com.example.EmployeeDB.model.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findAll(Sort sort);      //for sorting based on designation(1)

    //high performers(1)
    @Query("SELECT e FROM Employee e " +
            "WHERE e.joindate >= :threeMonthsAgo " +
            "ORDER BY e.starRating DESC LIMIT 5")
    List<Employee> findTopPerformersLast3Months(@Param("threeMonthsAgo") Date threeMonthsAgo);



}
