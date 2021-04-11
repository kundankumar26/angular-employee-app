package com.example.springbootbackened.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackened.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
