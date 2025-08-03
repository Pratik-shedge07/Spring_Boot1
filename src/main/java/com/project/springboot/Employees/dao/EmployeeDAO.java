package com.project.springboot.Employees.dao;

import com.project.springboot.Employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(long theId);

    Employee  save(Employee theEmployee);

    void deleteById(long theId);

}
