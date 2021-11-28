package com.example.kafkaconsumer.consumer;

import com.example.kafkaconsumer.domain.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 6:16 AM
 * Project: json-example
 * Package Name: com.example.kafkaconsumer.consumer
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeConsumer {

    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "t.employee")
    public void consumeEmployeeMessage(String employee) throws JsonProcessingException {
        log.info("Employee: {}",employee);
        Employee emp = objectMapper.readValue(employee, Employee.class);
        log.info("Employee Object: {}", emp);
    }
}
