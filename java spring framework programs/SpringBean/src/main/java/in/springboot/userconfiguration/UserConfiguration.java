package in.springboot.userconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.user.User;
import in.springboot.userservice.UserService;
import java.util.*;

@RestController
public class UserConfiguration {
	
	@Autowired
	UserService service;
	
	@GetMapping("/test")
	public List<User> getlist(){
		return service.getlistgetset();
	}

}
