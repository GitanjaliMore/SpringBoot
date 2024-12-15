package com.edu.service;

import java.util.List;

import com.edu.dao.Department;

public interface DepartmentService {

 

Department saveDepartment(Department department);

List<Department> getAllDepartments();

Department getDepartmentById(Integer departmentid);

List<Department> deleteDepartmentById(Integer departmentid);

Department updateDepartmentById(Integer departmentid, Department department);














	
}
