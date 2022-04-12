package in.springboot.modelcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.springboot.modeldata.Model;

@Controller
public class ModelController {
	
	
	@GetMapping("/model")
	public  @ResponseBody Model getmodel() {
		Model m=new Model();
		m.setId(1);
		m.setAge(21);
		m.setName("model class controller");
		m.setLocation("ghukna");
		return m;
		
	}

}
