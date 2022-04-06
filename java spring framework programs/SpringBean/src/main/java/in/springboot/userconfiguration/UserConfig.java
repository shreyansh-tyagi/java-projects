package in.springboot.userconfiguration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.springboot.user.User;
import in.springboot.userservice.UserService;

@Configuration
public class UserConfig {
	@Bean("bean1")
	public UserService getuserlist() {
		System.out.println("we are in function");
		return new UserService();
	}
	
	@Bean("bean2")
	public UserService getuserlist2() {
		System.out.println("we are in function in bean 2");
		return new UserService();
	}
	
	
}
