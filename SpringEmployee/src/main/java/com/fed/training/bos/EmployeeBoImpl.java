package com.fed.training.bos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fed.training.daos.EmployeeDao;
import com.fed.training.model.Employee;

@Service
public class EmployeeBoImpl  implements EmployeeBo{

	@Autowired
	EmployeeDao employeeDao;
	
//	public EmployeeBoImpl() {
//		employeeDao=new EmployeeDaoImpl();
//	}
	
	public List<Employee> getAll() {
		List<Employee> employees=employeeDao.getEmployees();
		if(employees.isEmpty()) {
			throw new RuntimeException("Empty list");
		}
		return employees;
	}

}
