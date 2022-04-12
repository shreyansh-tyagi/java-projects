package in.springboot.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.model.Model;

@RestController
public class ModelController {
	
	@PostMapping("/test")
	public String getpost(@Valid @RequestBody Model m) {
		System.out.println("printing the element: "+m);
		return "SUCCESS";
	}
	

}
