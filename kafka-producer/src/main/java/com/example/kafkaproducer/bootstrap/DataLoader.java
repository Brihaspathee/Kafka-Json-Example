package com.example.kafkaproducer.bootstrap;

import com.example.kafkaproducer.domain.entity.Employee;
import com.example.kafkaproducer.producer.EmployeeProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 6:05 AM
 * Project: json-example
 * Package Name: com.example.kafkaproducer.bootstrap
 * To change this template use File | Settings | File and Code Template
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final EmployeeProducer employeeProducer;
    @Override
    public void run(String... args) throws Exception {
        loadEmployees();
    }

    private void loadEmployees() throws JsonProcessingException {

        Employee employee = Employee.builder()
                .firstName("Balaji")
                .lastName("Varadharajan")
                .dateOfBirth(LocalDate.of(1983, 5, 21))
                .build();
        employeeProducer.sendEmployeeMessage(employee);
    }
}
