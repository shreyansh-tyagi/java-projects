package in.springboot.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	public EmployeeController(){
		System.out.println("we are in employee controller constructor");
		/* System.out.println(service.getlistpost()); */ //it will create a null pointer exception
	}
	
	@PostConstruct
	public void  getpostconstruct() {
		System.out.println("we are in get post construct ");
		System.out.println(service.getlistpost());
	}
	
	@GetMapping("/employee")
	public List<Employee> getlist(){
		return service.getlist();
	}
	
	@GetMapping("employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return service.getEmployee(id);
	}
	
	
	  @GetMapping("employee/{id}") public String getEmployee1(@PathVariable Long
	  id) { return "the passed id is: "+id;
	  
	  }
	  
	  @ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="pass integer only")
	  
	  @ExceptionHandler(IllegalArgumentException.class) public String
	  handleException(IllegalArgumentException ex) { return ex.getMessage(); }
	 
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorObject> handleException(){
		ErrorObject obj=new ErrorObject(HttpStatus.NOT_FOUND.value(),"data not found for this",System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(obj, HttpStatus.NOT_FOUND);
	}

}