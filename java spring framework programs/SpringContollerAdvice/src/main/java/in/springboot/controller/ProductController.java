package in.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.entity.Product;
import in.springboot.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public List<Product> getlist(){
		return service.getlist();
	}
	
	@GetMapping("/product/{id}")
	public Product get(@PathVariable Integer id) {
		return service.getProduct(id);
	}

}
