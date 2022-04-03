package in.springboot.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.student.Student;
import in.springboot.studentservice.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stservice;
	
	@GetMapping("/test")
	public List<Student> getlist(){
		System.out.println("inside controller method");
		return stservice.getstudentlist();
	}
	


}
