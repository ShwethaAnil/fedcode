package com.fed.training.controller;

import com.fed.training.bos.EmployeeBo;
import com.fed.training.model.*;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	//11
	//1 -1.45 
	//3:30
	
	
	@Autowired
	EmployeeBo employeeBo;
	
	
	@RequestMapping(value="employees",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees(){
		return employeeBo.getAll();
	}
//web initalizer--servlet--FrontController
	//DispatcherServlet
	//AnnotationConfigApplicationCOntext
}
