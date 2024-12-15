package com.springboot.dao;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeid;
	
	private String employeename;
	private Float employeesalary;
	private String employeephone;
	private String employeeemail;
	private Date employeejoindate;
	private Date employeedob;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String employeename, float employeesalary, String employeephone,
			String employeeemail, Date employeejoindate, Date employeedob) {
		super();
	
		this.employeename = employeename;
		this.employeesalary = employeesalary;
		this.employeephone = employeephone;
		this.employeeemail = employeeemail;
		this.employeejoindate = employeejoindate;
		this.employeedob = employeedob;
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Float getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(Float employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String getEmployeephone() {
		return employeephone;
	}
	public void setEmployeephone(String employeephone) {
		this.employeephone = employeephone;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public Date getEmployeejoindate() {
		return employeejoindate;
	}
	public void setEmployeejoindate(Date employeejoindate) {
		this.employeejoindate = employeejoindate;
	}
	public Date getEmployeedob() {
		return employeedob;
	}
	public void setEmployeedob(Date employeedob) {
		this.employeedob = employeedob;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", employeephone=" + employeephone + ", employeeemail=" + employeeemail
				+ ", employeejoindate=" + employeejoindate + ", employeedob=" + employeedob + "]";
	}
	


}
