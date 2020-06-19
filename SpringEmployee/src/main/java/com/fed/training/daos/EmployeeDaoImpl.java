package com.fed.training.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fed.training.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
//ORM
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		//return jdbcTemplate.query("slect * from employee", new EmployeeRowMapper());
		return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	//employee table 10 columns-- employee 10 field
	
	
//	Connection con=null;
//	
//	public EmployeeDaoImpl() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public List<Employee> getEmployees() {
//		List<Employee> employees=new ArrayList<Employee>();
//		Statement st;
//		try {
//			st = con.createStatement();
//			ResultSet rs=st.executeQuery("select * from employee");
//			while(rs.next()) {
//				Employee e1=new Employee();
//				e1.setEid(rs.getInt(1));
//				e1.setEname(rs.getString(2));
//				employees.add(e1);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return employees;
//	}
//spring jdbc module
}
