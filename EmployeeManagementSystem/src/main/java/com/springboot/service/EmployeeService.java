package com.springboot.service;

import java.util.List;

import com.springboot.dao.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Integer employeeid);

	public List<Employee> deleteEmployeeById(Integer employeeid);

	public Employee updateEmployeeById(Integer employeeid, Employee employee);

	
 

}
