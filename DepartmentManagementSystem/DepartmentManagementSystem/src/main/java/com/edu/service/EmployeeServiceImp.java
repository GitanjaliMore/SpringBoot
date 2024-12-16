package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Department;
import com.edu.dao.Employee;
import com.edu.repository.DepartmentRepository;
import com.edu.repository.EmployeeRepository;


@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer employeeid) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeid).get();
	}

	@Override
	public List<Employee> deleteEmployeeById(Integer employeeid) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeid);
		 return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployeeById(Integer employeeid, Employee employee) {
		// TODO Auto-generated method stub
		
		Employee emp1 = employeeRepository.findById(employeeid).get();
		
		if(emp1!= null) {
			
			if(employee.getEmployeename()!=null)
			emp1.setEmployeename(employee.getEmployeename());
			
			   if (employee.getEmployeesalary() != null) {
		            emp1.setEmployeesalary(employee.getEmployeesalary());
		        }
		        if (employee.getEmployeephone() != null) {
		            emp1.setEmployeephone(employee.getEmployeephone());
		        }
		        if (employee.getEmployeeemail() != null) {
		            emp1.setEmployeeemail(employee.getEmployeeemail());
		        }
		        if (employee.getEmployeejoindate() != null) {
		            emp1.setEmployeejoindate(employee.getEmployeejoindate());
		        }
		        if (employee.getEmployeedob() != null) {
		            emp1.setEmployeedob(employee.getEmployeedob());
		        }
		        
		}
		employeeRepository.save(emp1);
		return emp1;
	}

	@Override
public List<Department>  updateDepartmentIdToEmployee(Integer departmentid, Integer employeeid) {
		// TODO Auto-generated method stub
		
		Department dob = departmentRepository.findById(departmentid).get();
		
		
		Employee eob = employeeRepository.findById(employeeid).get();
		
		eob.setDepartment(dob);
		
	employeeRepository.save(eob);
	return departmentRepository.findAll();
	}

	

}
