package in.springboot.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.entity.Employee;
import in.springboot.exception.ErrorObject;
import in.springboot.exception.NoDataFoundException;
import in.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	public EmployeeController() {
		System.out.println("we are in employee controller constructor");
		/* System.out.println(service.getlistpost()); */ // it will create a null pointer exception
	}

	@PostConstruct
	public void getpostconstruct() {
		System.out.println("we are in get post construct ");
		System.out.println(service.getlistpost());
	}

	@GetMapping("/employee")
	public List<Employee> getlist() {
		return service.getlist();
	}

	@GetMapping("employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return service.getEmployee(id);
	}

	/*
	 * @GetMapping("employee/{id}") public String getEmployee1(@PathVariable String
	 * id) { return "the passed id is: " + id;
	 * 
	 * }
	 */ 
	@GetMapping("users/{id}/{name}/{age}/{location}")
	public String getpostvariable(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer age,@PathVariable String location) {
		return "id: "+id+" my name is: "+name+" age: "+age+" location: "+location;
	}
	
	
	@PostMapping("/employee")
	public String postmapping(@RequestBody Employee emp) {
		System.out.println("printing the employee data"+emp);
		return "SUCCESS";
	}
	
	@RequestMapping(value= {"user1","user2"})
	public String getrequest() {
		return "WE ARE IN REQUEST MAPPING"; 
	}
	

	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "pass integer only")
	@ExceptionHandler(NumberFormatException.class)
	public String handleException(IllegalArgumentException ex) {
		return ex.getMessage();
	} 

	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorObject> handleException() {
		ErrorObject obj = new ErrorObject(HttpStatus.NOT_FOUND.value(), "data not found for this",
				System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(obj, HttpStatus.NOT_FOUND);
	}

}