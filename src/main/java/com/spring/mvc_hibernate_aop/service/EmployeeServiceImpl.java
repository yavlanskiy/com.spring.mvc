package com.spring.mvc_hibernate_aop.service;

import com.spring.mvc_hibernate_aop.dao.EmployeesDAO;
import com.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeesDAO employeesDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeesDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeesDAO.saveEmployee(employee);
    }
}
