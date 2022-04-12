package in.springboot.contoller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
	
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
