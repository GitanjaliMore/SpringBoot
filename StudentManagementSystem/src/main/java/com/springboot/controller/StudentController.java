package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.dao.Student;
import com.springboot.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;
	//save Student
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	//fetch the records
	//http://localhost:9090/getAllStudents
	 @GetMapping("/getAllStudents")
	  public List<Student> getAllStudents(){
	  return studentService.getAllStudents();
				
			}
			
	 //get record by id				
	// http://localhost:9090/getStudentById/1
					
	 @GetMapping("/getStudentById/{sid}")
	  public Student getStudentById(@PathVariable("sid") Integer sid) {
						
	   System.out.println("student id="+sid);
	   return studentService.getStudentById(sid);
						
					}
		
	//delete record by id
//	 @DeleteMapping("/deleteStudenteById/{sid}")
//	 public String deleteStudentById(@PathVariable("sid") Integer sid) {
//	 studentService.deleteStudentById(sid);
//	 return "Student with id="+sid+"is deleted";
							
	 
		//delete record by id
	 //to delete data and showing the remaining data
		// http://localhost:9090/deleteStudentById/1
	@DeleteMapping("/deleteStudenteById/{sid}")
	public List<Student> deleteStudentById(@PathVariable("sid") Integer sid) {
    return studentService.deleteStudentById(sid);
						
		
		
			}
		
	   //http://localhost:9090/updateStudentById/1
		@PutMapping("/updateStudentById/{sid}")
		public Student updateStudentById(@PathVariable("sid") Integer sid,@RequestBody Student student) {
		return studentService.updateStudentById(sid, student);
		
					}
					
}
