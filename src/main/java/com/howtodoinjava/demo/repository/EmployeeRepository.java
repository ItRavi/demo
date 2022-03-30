package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.model.EmployeeEntity;

@Service
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
