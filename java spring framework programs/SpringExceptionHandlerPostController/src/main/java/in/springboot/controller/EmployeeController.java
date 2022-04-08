package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.entity.Employee;
import in.springboot.exception.ErrorObject;
import in.springboot.exception.NoDataFoundException;
import in.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getlist(){
		return service.getlist();
	}
	
	@GetMapping("employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return service.getEmployee(id);
	}
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorObject> handleException(){
		ErrorObject obj=new ErrorObject(HttpStatus.NOT_FOUND.value(),"data not found for this",System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(obj, HttpStatus.NOT_FOUND);
	}

}
