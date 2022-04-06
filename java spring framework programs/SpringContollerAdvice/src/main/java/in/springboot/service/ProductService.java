package in.springboot.service;

import java.util.ArrayList;
import java.util.List;

import in.springboot.entity.Product;

public class ProductService {
	List<Product> list=new ArrayList<>();
	
	public List<Product> getlist(){
		list.add(new Product(1, "iPhone XR", 500.00));
		list.add(new Product(2, "Galaxy Note 10", 700.00));
		list.add(new Product(3, "Oneplus Nord", 400.00));
		list.add(new Product(4, "Galaxy S10", 750.00));
		list.add(new Product(5, "iPhone 11", 700.00));
		
	}

}
