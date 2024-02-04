package com.example.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.example.task.dao.EmployeeDao;
import com.example.task.exception.DataNotFoundException;
import com.example.task.model.Employee;


@Controller
public class HomeController {
	private final EmployeeDao employeeDao;

    @Autowired
    public HomeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/searchpage")
    public String showSearchPage() {
        return "searchpage";
    }
    
    @PostMapping("/search")
    public String search(@RequestParam String firstName, Model model) {
        try {
            List<Employee> employees = employeeDao.findByFirstName(firstName);
            model.addAttribute("employees", employees);
            return "result";
        } catch (DataNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "error";
        }
    
}
}