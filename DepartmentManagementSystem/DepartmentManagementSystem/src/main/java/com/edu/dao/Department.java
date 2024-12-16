package com.edu.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Department {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentid;
@NotEmpty(message ="Enter Department name")
@Column(nullable = false,length=50)
	private String name;

@NotEmpty(message ="Enter Department Location")
@Column(nullable = false,length=50)
	private String location;

//OneToMany
//Department class
@OneToMany(mappedBy = "department")
List<Employee> empoyeelist=new ArrayList<Employee>();



	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department( String name, String location) {
		super();
	
		this.name = name;
		this.location = location;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	public List<Employee> getEmpoyeelist() {
		return empoyeelist;
	}
	public void setEmpoyeelist(List<Employee> empoyeelist) {
		this.empoyeelist = empoyeelist;
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", name=" + name + ", location=" + location + "]";
	}
	
	
}


