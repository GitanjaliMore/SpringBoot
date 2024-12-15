package com.springboot.service;

import java.util.List;

import com.springboot.dao.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudents();

	public Student getStudentById(Integer sid);

	//public void deleteStudentById(Integer sid);

	public Student updateStudentById(Integer sid, Student student);

	public List<Student> deleteStudentById(Integer sid);

}
