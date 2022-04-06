package in.springboot;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanApplication { 

	public static void main(String[] args) {
		/* ApplicationContext ap = */SpringApplication.run(SpringBeanApplication.class, args);
		// ApplicationContext ap = new
		// AnnotationConfigApplicationContext(SpringBeanApplication.class);

		// here application context is the interface of the bean factory object and
		// annotation configuration
		// application context is the class of application context interface

		// one way of using and calling beans is by using the class name in which bean
		// is defined
		/*
		 * UserService u = ap.getBean(UserService.class); // using the object of
		 * application context we are accessing the // get bean method and then passing
		 * the class name as a // parameter
		 * System.out.println("printing the list created using constructor: " +
		 * u.getlistconstruct());
		 * 
		 * // by using the alias name UserService u1 = (UserService)
		 * ap.getBean("bean1"); System.out.
		 * println("printing the list created using constructor using alias: " +
		 * u1.getlistconstruct());
		 * 
		 * 
		 * UserService u2=(UserService) ap.getBean("bean2"); System.out.
		 * println("printing the list created using getset method using alias: "+u2.
		 * getlistgetset());
		 * 
		 * 
		 * ((AbstractApplicationContext) ap).close();
		 */
	}

}
