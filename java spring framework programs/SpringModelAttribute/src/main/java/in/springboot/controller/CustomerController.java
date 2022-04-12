package in.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.springboot.entity.Customer;

@Controller
public class CustomerController {
	
	@GetMapping("/customer")
	public String getcust() {
		return "SUCCESS";
	}
	
	@ModelAttribute("customer")
	public Customer getvalue() {
		return new Customer("shreyanhs","ghaziabad",23); 
	}

}
