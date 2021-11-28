package com.example.kafkaproducer.domain.entity;

import lombok.*;

import java.time.LocalDate;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 6:02 AM
 * Project: json-example
 * Package Name: com.example.kafkaproducer.domain.entity
 * To change this template use File | Settings | File and Code Template
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long employeeId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
