package in.springboot.userconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.user.User;
import in.springboot.userservice.UserService;
import java.util.*;

@RestController
@Configuration
public class UserConfiguration {
	
	@Autowired
	UserService service;
	
	@GetMapping("/test")
	public List<User> getlist(){
		return service.getlistgetset();
	}
	
	@Bean(name={"bean1","bean2"})
	public UserService getuserlist() {
		return new UserService();
	}

}
