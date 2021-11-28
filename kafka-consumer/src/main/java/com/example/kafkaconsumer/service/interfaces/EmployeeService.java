package com.example.kafkaconsumer.service.interfaces;

import com.example.kafkaconsumer.domain.entity.Employee;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 9:48 AM
 * Project: json-example
 * Package Name: com.example.kafkaconsumer.service.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee createEmployee(Employee employee);
}
