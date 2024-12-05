package com.lmsEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmsEmployee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}