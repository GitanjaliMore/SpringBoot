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
import com.edu.service.DepartmentService;

@RestController
public class DepatmentController {
	
	//Injection the refernce of DepartmentService
	@Autowired
	public DepartmentService departmentService;
	
	//save department
	
	/* used to insert new record-@PostMapping
	delete by id-@DeleteMapping
	update by id-@UpdateMapping
	get the record-@GetMapping */
	
	/* http://localhost:9090/saveDepartment */
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

	
	//fetch the records
	//http://localhost:9090/getAllDepartments
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartents(){
		return departmentService.getAllDepartments();
		
	}
	
	
	//get record by id
		/* select * from department where departmentid=?  */
		
		// http://localhost:9090/getDeprtmentById/1
		
		@GetMapping("/getDepartmentById/{deptid}")
		public Department getDepartmentById(@PathVariable("deptid") Integer departmentid) {
			
			System.out.println("department id="+departmentid);
			return departmentService.getDepartmentById(departmentid);
			
		}

//delete record by id
		// http://localhost:9090/deleteDepartmentById/1
		@DeleteMapping("/deleteDepartmentById/{deptid}")
		public List<Department> deleteDepartmentById(@PathVariable("deptid") Integer departmentid) {
			return departmentService.deleteDepartmentById(departmentid);
			

			
		}
		
		//http://localhost:9090/updateDepartmentById/1
		@PutMapping("/updateDepartmentById/{deptid}")
		public Department updateDepartmentById(@PathVariable("deptid") Integer departmentid,@RequestBody Department department) {
			return departmentService.updateDepartmentById(departmentid, department);
		}
		
		
	
		}

