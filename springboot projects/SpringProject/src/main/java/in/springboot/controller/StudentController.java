package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/student")
	public String registerNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
		return "Success";
	}

	@DeleteMapping(path="/student/{studentId}")
	public String deleteStudent(@PathVariable("studentId") Long studentId) {
		service.deleteStudent(studentId);
		return "SUCCESS";
		
	}

	@PutMapping(path="/student/{studentId}")
	public String updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required=false) String name,@RequestParam(required=false) String email) {
		service.updateStudent(studentId,name,email);
		return "UPDATED SUCCESS";
	}
}
