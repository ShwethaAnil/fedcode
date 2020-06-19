package com.fed.training.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fed.training.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e1=new Employee();
		e1.setEid(rs.getInt(1));
		e1.setEname(rs.getString(2));
		return e1;
	}

}
