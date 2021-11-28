package com.example.kafkaconsumer.domain.repository;

import com.example.kafkaconsumer.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 9:46 AM
 * Project: json-example
 * Package Name: com.example.kafkaconsumer.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
}
