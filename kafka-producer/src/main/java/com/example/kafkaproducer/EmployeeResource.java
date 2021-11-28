package com.example.kafkaproducer;

import com.example.kafkaproducer.domain.entity.Employee;
import com.example.kafkaproducer.producer.EmployeeProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 9:22 AM
 * Project: json-example
 * Package Name: com.example.kafkaproducer
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeResource {

    private final EmployeeProducer employeeProducer;

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody Employee employee) throws JsonProcessingException {
        employeeProducer.sendEmployeeMessage(employee);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
