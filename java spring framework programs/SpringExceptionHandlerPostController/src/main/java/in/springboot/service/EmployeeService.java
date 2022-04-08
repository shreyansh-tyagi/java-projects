package in.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import in.springboot.entity.Employee;
import in.springboot.exception.NoDataFoundException;

@Service
public class EmployeeService {
	List<Employee> list = new ArrayList<>();

	public List<Employee> getlist() {

		list.add(new Employee(1, 21, "shreyanhs"));
		list.add(new Employee(2, 22, "shrey"));
		list.add(new Employee(3, 23, "shreya"));
		list.add(new Employee(4, 24, "amit"));
		return list; 
	}

	public Employee getEmployee(@PathVariable Integer id) {
		Optional<Employee> theEmployee = list.stream().filter(e -> e.getId() == id).findFirst();
		if (!theEmployee.isPresent()) {
			throw new NoDataFoundException("employee is not present for id: " + id);
		}
		return theEmployee.get();

	}

}
