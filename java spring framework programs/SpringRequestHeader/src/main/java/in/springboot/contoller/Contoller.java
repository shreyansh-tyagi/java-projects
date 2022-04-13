package in.springboot.contoller;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.customer.Customer;

@RestController
public class Contoller {
	
	@GetMapping("/user") //localhost:8080/user?name=shreyansh&age=25  this is the way to provide the link for request param 
	public String getuser(@RequestParam String name,@RequestParam(defaultValue="25") int age) {
		return "my name is "+name+" and age is "+age;
	}
	 
	@GetMapping("/customer")
	public ResponseEntity<Customer> getcustomer(){
		Customer c =new Customer("shrey","nandgram",23);
		HttpHeaders head=new HttpHeaders();
		head.add("token", "token value");
		head.add("shrey key", "value of shrey");
		return ResponseEntity.ok().headers(head).body(c);
		
	}
	
	@GetMapping("/test")
	public String requestheader(@RequestHeader String authr) { //here this is the key which should be given same 
		System.out.println("printing the elements: "+authr);  //here this is the value which can be any value you provide to that particular key 
		return "SUCCESS";
	}

	
	@GetMapping("/tests") 
	public String reqheader(@RequestHeader Map<String,String> mapvalue) {
		System.out.println("printing the elements: "+mapvalue);  //here this is the value which can be any value you provide to that particular key 
		return "SUCCESS";
	}
}
