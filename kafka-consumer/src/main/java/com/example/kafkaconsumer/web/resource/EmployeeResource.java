package com.example.kafkaconsumer.web.resource;

import com.example.kafkaconsumer.domain.entity.Employee;
import com.example.kafkaconsumer.service.interfaces.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 10:04 AM
 * Project: json-example
 * Package Name: com.example.kafkaconsumer.web.resource
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeResource {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getAllEmployees(){
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity(employees, HttpStatus.OK);
    }
}
