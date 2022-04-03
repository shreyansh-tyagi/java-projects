/**
 * 
 */
package in.springboot.service;
import java.util.*;

import org.springframework.stereotype.Service;


import in.springboot.entity.Customer;

/**
 * @author Admin
 *
 */
@Service
public class ControllerService {
	static List<Customer> list=new ArrayList<>();
	static {
	
	Customer c = new Customer();
	c.setId(1);
	c.setAge(21);
	c.setName("shreyansh");
	c.setLocation("ghaziabad");
	list.add(c);

	c = new Customer();
	c.setId(1);
	c.setAge(23);
	c.setName("shivani");
	c.setLocation("ghukna");
	list.add(c);

	c = new Customer();
	c.setId(1);
	c.setAge(24);
	c.setName("ajay");
	c.setLocation("delhi");
	list.add(c);
	}

	
	public List<Customer> getlist(){
		/*List<Customer> list=new ArrayList<>();
		Customer c = new Customer();
		c.setId(1);
		c.setAge(21);
		c.setName("shreyansh");
		c.setLocation("ghaziabad");
		list.add(c);

		c = new Customer();
		c.setId(1);
		c.setAge(23);
		c.setName("shivani");
		c.setLocation("ghukna");
		list.add(c);

		c = new Customer();
		c.setId(1);
		c.setAge(24);
		c.setName("ajay");
		c.setLocation("delhi");
		list.add(c);
         */
 		return list;
	}
	

}
