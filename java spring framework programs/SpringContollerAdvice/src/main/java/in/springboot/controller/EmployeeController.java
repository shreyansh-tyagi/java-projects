package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.entity.Employee;
import in.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getlist(){
		return service.getlist();
	}

	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable Integer id) {
		return service.getEmployee(id);
		
	}
	
}

