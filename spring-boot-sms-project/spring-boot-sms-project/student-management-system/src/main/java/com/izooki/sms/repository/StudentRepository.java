package com.izooki.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izooki.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
