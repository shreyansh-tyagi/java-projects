package in.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.springboot.entity.Product;
import in.springboot.exceptions.NoDataFoundException;
import in.springboot.exceptions.ResouceNotFoundException;

@Service
public class ProductService {
	List<Product> list = new ArrayList<>();

	public List<Product> getlist() {
		list.add(new Product(1, "iPhone XR", 500.00));
		list.add(new Product(2, "Galaxy Note 10", 700.00));
		list.add(new Product(3, "Oneplus Nord", 400.00));
		list.add(new Product(4, "Galaxy S10", 750.00));
		list.add(new Product(5, "iPhone 11", 700.00));

		if (list.size() > 0)
			return list;
		throw new NoDataFoundException("no product is available");

	}

	public Product getProduct(Integer id) {
		Optional<Product> theProduct = list.stream().filter(p -> p.getId() == id).findFirst();
		if (!theProduct.isPresent()) {
			throw new ResouceNotFoundException("product is not available for id " + id);
		}
		return theProduct.get();

	}

}
