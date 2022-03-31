package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 
@SpringBootApplication //configuration, component scan , enableautoconfiguration
public class SpringFirstProgramApplication {
	@RequestMapping()
	public String name() {
		return "<h1> hello shreyansh <h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstProgramApplication.class, args);
	}

}
