package com.springboot.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;

	private String sname;
	private String semail;
	private Integer sage;
	private Float sfees;
	private Date sdob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String sname, String semail, Integer sage, float sfees, Date sdob) {
		super();
		
		this.sname = sname;
		this.semail = semail;
		this.sage = sage;
		this.sfees = sfees;
		this.sdob = sdob;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public Float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	public Date getSdob() {
		return sdob;
	}
	public void setSdob(Date sdob) {
		this.sdob = sdob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sage=" + sage + ", sfees=" + sfees
				+ ", sdob=" + sdob + "]";
	}
	
	
	
}

