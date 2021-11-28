package com.example.kafkaconsumer.service.impl;

import com.example.kafkaconsumer.domain.entity.Employee;
import com.example.kafkaconsumer.domain.repository.EmployeeRespository;
import com.example.kafkaconsumer.service.interfaces.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 9:49 AM
 * Project: json-example
 * Package Name: com.example.kafkaconsumer.service.impl
 * To change this template use File | Settings | File and Code Template
 */
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRespository employeeRespository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRespository.save(employee);
    }
}
