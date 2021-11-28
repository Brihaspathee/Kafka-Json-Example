package com.example.kafkaproducer.producer;

import com.example.kafkaproducer.domain.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 6:08 AM
 * Project: json-example
 * Package Name: com.example.kafkaproducer.producer
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private final ObjectMapper objectMapper;

    public void sendEmployeeMessage(Employee employee) throws JsonProcessingException {
        log.info("About to send message");
        String employeeAsString = objectMapper.writeValueAsString(employee);
        kafkaTemplate.send("t.employee",employeeAsString);
    }
}
