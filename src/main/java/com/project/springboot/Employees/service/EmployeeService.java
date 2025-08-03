package com.project.springboot.Employees.service;

import com.project.springboot.Employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
