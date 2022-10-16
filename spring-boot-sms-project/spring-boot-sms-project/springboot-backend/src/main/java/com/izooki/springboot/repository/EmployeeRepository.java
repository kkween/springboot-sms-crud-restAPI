package com.izooki.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izooki.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
