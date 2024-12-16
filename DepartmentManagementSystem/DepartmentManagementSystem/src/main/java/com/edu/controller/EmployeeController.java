package com.edu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Department;
import com.edu.dao.Employee;
import com.edu.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	//save Employee
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	//fetch the records
		//http://localhost:9090/getAllEmployees
		@GetMapping("/getAllEmployees")
		public List<Employee> getAllEmployees(){
			return employeeService.getAllEmployees();
			
		}
		//get record by id
	
				
		// http://localhost:9090/getEmployeeById/1
				
		@GetMapping("/getEmployeeById/{empid}")
		public Employee getEmployeeById(@PathVariable("empid") Integer employeeid) {
					
		System.out.println("employee id="+employeeid);
		return employeeService.getEmployeeById(employeeid);
					
				}
		
		//delete record by id
		// http://localhost:9090/deleteEmployeeById/1
		@DeleteMapping("/deleteEmployeeById/{empid}")
		public List<Employee> deleteEmployeeById(@PathVariable("empid") Integer employeeid) {
		return employeeService.deleteEmployeeById(employeeid);
					
	
	
		}
		//http://localhost:9090/updateEmployeeById/1
		@PutMapping("/updateEmployeeById/{empid}")
		public Employee updateEmployeeById(@PathVariable("empid") Integer employeeid,@RequestBody Employee employee) {
		return employeeService.updateEmployeeById(employeeid, employee);
				}
		
		//update departmentid to employee
		//http:/localhost:9090/updateDepartmentIdToEmployee/deptid/1/empid/1
		
	//@PutMapping("/updateDepartmentIdToEmployee/deptid/{deptid}/empid/{empid}")
	//public Employee updateDepartmentIdToEmployee(@PathVariable("deptid") Integer departmentid, @PathVariable("empid") Integer employeeid) {
	//return employeeService.updateDepartmentIdToEmployee(departmentid,employeeid);
	//}
		
	//set courseid to student
	//http://localhost:9090/updateCourseIdToStudent/deptid/1/empid/1
	@PutMapping("/updateDepartmentIdToEmployee/deptid/{deptid}/empid/{empid}")
	public List<Department>  updateDpeartmentIdToEmployee(@PathVariable("deptid")Integer departmentid, @PathVariable("empid")Integer employeeid) {
		return employeeService.updateDepartmentIdToEmployee(departmentid, employeeid);
	}	

}


