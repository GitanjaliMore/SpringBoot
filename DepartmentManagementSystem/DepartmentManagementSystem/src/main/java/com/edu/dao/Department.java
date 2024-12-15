package com.edu.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Department {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentid;
	private String name;
	private String location;
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
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", name=" + name + ", location=" + location + "]";
	}
	
	
}


