package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("lizette", "jamison");
	}

	@GetMapping("/students")
	public List<Student> getStudents(){		
		List<Student> students = new ArrayList<>();
		students.add(new Student("lizette", "jamison"));
		students.add(new Student("deborah", "miller"));
		students.add(new Student("anais", "nin"));
		students.add(new Student("pualani", "jackson"));
		students.add(new Student("beth", "franklin"));
		return students;
	}
	
	// http://localhost:8080/student/1
	// @PathVariable annotation
	@GetMapping("/student/{firstName}/{lastName}/")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, 
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// build rest API to handle query parameters
	// http://localhost:8080/student/query?firstName=lizette&lastName=jamison
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	
	
}
