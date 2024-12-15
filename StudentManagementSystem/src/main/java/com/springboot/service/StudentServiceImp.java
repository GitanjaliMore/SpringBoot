package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.dao.Student;
import com.springboot.repository.StudentRepository;


@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer sid) {
		// TODO Auto-generated method stub
		return studentRepository.findById(sid).get();
	}

//	@Override
//	public void deleteStudentById(Integer sid) {
//		// TODO Auto-generated method stub
//		studentRepository.deleteById(sid);
		
//	}

	@Override
	public Student updateStudentById(Integer sid, Student student) {
		// TODO Auto-generated method stub
		
        Student stud1 = studentRepository.findById(sid).get();
		
		if(stud1!= null) {
			
			if(student.getSname()!=null)
			stud1.setSname(student.getSname());
			
			   if (student.getSemail() != null) {
		            stud1.setSemail(student.getSemail());
		        }
			   if (student.getSage() != null) {
		            stud1.setSage(student.getSage());
		        }
		        if (student.getSfees() != null) {
		            stud1.setSfees(student.getSfees());
		        }
		        if (student.getSdob() != null) {
		            stud1.setSdob(student.getSdob());
		        }

		    }
		// Save updated student details
        studentRepository.save(stud1);
        return stud1;
}

	@Override
	public List<Student> deleteStudentById(Integer sid) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(sid);
		return studentRepository.findAll();
	}
}
