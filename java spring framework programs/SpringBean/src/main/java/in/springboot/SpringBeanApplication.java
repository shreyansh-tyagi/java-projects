package in.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.springboot.userservice.UserService;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
		ApplicationContext ap=new AnnotationConfigApplicationContext(SpringBeanApplication.class);
		
		//here application context is the interface of the bean factory object and annotation configuration
		// application context is the class of application context interface 
		
		
		//one way of using and calling beans is by using the class name in which bean is defined 
		UserService u=ap.getBean(UserService.class);
		System.out.println("printing the user created list using constructor: "+u.getlistconstruct());
	}

}
