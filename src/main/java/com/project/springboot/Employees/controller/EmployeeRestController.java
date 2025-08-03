package com.project.springboot.Employees.controller;

import com.project.springboot.Employees.dao.EmployeeDAO;
import com.project.springboot.Employees.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDao) {
        employeeDAO = theEmployeeDao;
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}