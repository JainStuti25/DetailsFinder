package com.example.task;

import org.springframework.jdbc.core.RowMapper;

import com.example.task.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setPsid(resultSet.getLong("psid"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setLocation(resultSet.getString("location"));
        employee.setAge(resultSet.getInt("age"));
        employee.setDesignation(resultSet.getString("designation"));
        return employee;
    }
}
