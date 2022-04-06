package in.springboot.service;

import java.util.ArrayList;
import java.util.List;

import in.springboot.entity.Employee;
import in.springboot.exceptions.NoDataFoundException;

public class EmployeeService {
	public List<Employee> getlist(){
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Employee 1", 28, "India"));
		list.add(new Employee(2, "Employee 2", 29, "India"));
		list.add(new Employee(3, "Employee 3", 30, "India"));
		list.add(new Employee(4, "Employee 4", 43, "India"));
		list.add(new Employee(5, "Employee 5", 55, "India"));
		
		if(list.size()>0)
			return list;
		throw new NoDataFoundException("there is no data available inside the list, list is empty");
	}

}
