package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.service.StudentService;
import in.springboot.student.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/student")
	public List<Student> getlist() {
		return service.getlist();
	}

}
