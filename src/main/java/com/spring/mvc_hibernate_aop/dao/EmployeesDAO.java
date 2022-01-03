package com.spring.mvc_hibernate_aop.dao;

import com.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeesDAO {
    public List<Employee> getAllEmployees();
}
