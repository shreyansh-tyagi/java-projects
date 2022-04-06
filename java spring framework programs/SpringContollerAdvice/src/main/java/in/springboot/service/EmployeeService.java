package in.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import in.springboot.entity.Employee;
import in.springboot.exceptions.NoDataFoundException;
import in.springboot.exceptions.ResouceNotFoundException;

public class EmployeeService {
	List<Employee> list=new ArrayList<>();
	public List<Employee> getlist(){
		
		list.add(new Employee(1, "Employee 1", 28, "India"));
		list.add(new Employee(2, "Employee 2", 29, "India"));
		list.add(new Employee(3, "Employee 3", 30, "India"));
		list.add(new Employee(4, "Employee 4", 43, "India"));
		list.add(new Employee(5, "Employee 5", 55, "India"));
		
		if(list.size()>0)
			return list;
		throw new NoDataFoundException("there is no data available inside the list, list is empty");
	}
	
	public Employee getEmployee(Integer id) {
		Optional<Employee> theEmployee=list.stream().filter(e->e.getId()==id).findFirst();
		if(!theEmployee.isPresent()) {
			throw new ResouceNotFoundException("employee not found for the id"+id);
		}
		return theEmployee.get();
		
	}

}
