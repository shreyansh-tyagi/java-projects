/**
 * 
 */
package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.service.ControllerService;
import in.springboot.entity.Customer;
/**
 * @author Admin
 *
 */
@RestController //used for rest api in order get put delete
public class CustomerController {
	
	@Autowired // used to autowire bean on the setter method
	
	ControllerService service;
	
	@GetMapping("/testing")
	public List<Customer> getList(){
		System.out.println("inside controller method");
		System.out.println("inside controller method");
		
		return service.getlist();  
	}
 
}
