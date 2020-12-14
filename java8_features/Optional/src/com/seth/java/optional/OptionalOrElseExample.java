package com.seth.java.optional;

import java.util.Optional;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
//		Optional<Student> studentOptional = Optional
//				.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<Student> studentOptional = Optional
				.ofNullable(null);
		
		return studentOptional.map(Student::getName).orElse("Default");
	}
	
	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional
				.ofNullable(null);
		
		return studentOptional.map(Student::getName).orElseGet(() -> "Default");
	}
	
	public static String optionalOrElseThrow() {
		Optional<Student> studentOptional = Optional
				.ofNullable(null);
		
		return studentOptional.map(Student::getName)
				.orElseThrow(() -> new RuntimeException("No Data Found"));
	}
	
	public static void main(String[] args) {
		
		System.out.println("OrElse :" + optionalOrElse());
		System.out.println("OrElseGet :" + optionalOrElseGet());
		System.out.println("OrElseThrow :" + optionalOrElseThrow());
	}

}
