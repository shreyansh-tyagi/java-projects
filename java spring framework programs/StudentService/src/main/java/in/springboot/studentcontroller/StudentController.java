package in.springboot.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.springboot.student.Student;
import in.springboot.studentservice.StudentService;

@RequestMapping
public class StudentController {
	
	@Autowired
	StudentService stservice;
	
	@GetMapping("/studentest")
	public List<Student> getlist(){
		return stservice.getstudentlist();
	}
	


}
