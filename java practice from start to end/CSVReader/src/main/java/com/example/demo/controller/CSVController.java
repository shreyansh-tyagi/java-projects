package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CSVReaderService;

@Controller
public class CSVController {
	
	@Autowired
	private CSVReaderService csvReaderService;
	
	@GetMapping("/getdata")
	public String CSVData() {
		csvReaderService.readColumn();
		return "success";
		
	}

}
