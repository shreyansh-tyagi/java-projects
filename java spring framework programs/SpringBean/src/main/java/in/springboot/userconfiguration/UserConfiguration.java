package in.springboot.userconfiguration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//port org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.user.User;
import in.springboot.userservice.UserService;

@RestController

public class UserConfiguration {
	
	@Autowired
	@Qualifier("bean3")
	UserService service;
	
	@Autowired
	@Qualifier("bean2") 
	UserService service2;
	
	@GetMapping("/test")
	public List<User> getlist(){
		List<User> users = service2.getlistconstruct();
		System.out.println(users); 
		return service.getlistgetset();
		
	}
	
	

}
