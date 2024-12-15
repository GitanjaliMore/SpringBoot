package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Department;
import com.edu.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return  departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Integer departmentid) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentid).get();
	}

	@Override
	public List<Department> deleteDepartmentById(Integer departmentid) {
		// TODO Auto-generated method stub
		 departmentRepository.deleteById(departmentid);
		 return departmentRepository.findAll();
	}

	@Override
	public Department updateDepartmentById(Integer departmentid, Department department) {
		// TODO Auto-generated method stub
		/* 
		 select * from department where departmentid="+departmentid;
		 department -> departmentname or departmentlocation
		 
		 */
		Department dept1 = departmentRepository.findById(departmentid).get();
		
		if(dept1!=null) {
			if(department.getName()!=null)
			dept1.setName(department.getName());
			if(department.getLocation()!=null)
			dept1.setLocation(department.getLocation());
			
			
		}
		
		departmentRepository.save(dept1);
		return dept1;
	}
	}

	
	
	
	
	
	
	

