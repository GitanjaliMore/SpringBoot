package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.dao.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {

}
