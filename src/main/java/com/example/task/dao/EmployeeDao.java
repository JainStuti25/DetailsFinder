package com.example.task.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.task.model.Employee;
import com.example.task.EmployeeRowMapper;
import com.example.task.exception.DataNotFoundException;

import java.util.List;

@Repository
public class EmployeeDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> findByFirstName(String firstName) {
        String sql = "SELECT * FROM sqldata WHERE first_name = ?";
        List<Employee> employees = jdbcTemplate.query(sql, new Object[]{firstName}, new EmployeeRowMapper());

        if (employees.isEmpty()) {
            throw new DataNotFoundException("No employee found with the given first name: " + firstName);
        }

        return employees;
    }
}
