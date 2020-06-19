package com.fed.training.view;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fed.training.bos.EmployeeBo;
import com.fed.training.bos.EmployeeBoImpl;
import com.fed.training.config.AppConfig;
import com.fed.training.model.Employee;

public class EmployeeApp {
//	@Autowired
//	static EmployeeBo employeeBo;

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("List of employees");
		EmployeeBo employeeBo=context.getBean(EmployeeBoImpl.class);
		List<Employee> employees=employeeBo.getAll();
		for(Employee e:employees) {
			System.out.println(e.getEid()+" "+e.getEname());
		}

	}

}
