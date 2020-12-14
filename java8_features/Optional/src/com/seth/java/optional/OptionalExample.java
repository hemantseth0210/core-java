package com.seth.java.optional;

import java.util.Optional;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
		
		Student student = StudentDataBase.studentSupplier.get();
		if(student !=null) {
			return student.getName();
		}
		return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null);
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		
		Optional<String> stringOptional = getStudentNameOptional();
		if(stringOptional.isPresent()) {
			System.out.println("Length of the student name: "+ stringOptional.get().length());
		} else {
			System.out.println("Name not found");
		}
	}

}
