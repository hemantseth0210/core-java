package com.seth.java.optional;

import java.util.Optional;

import com.seth.java.data.Bike;
import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() > 4.5)
						.ifPresent(System.out::println);
	}
	
	public static void optionalMap() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDataBase.studentSupplier.get());
		if(studentOptional.isPresent()) {
			Optional<String> opt = studentOptional.filter(student -> student.getGpa() > 3.5)
							.map(Student::getName);
			System.out.println(opt.get());
		}
		
	}
	
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDataBase.getOptionalStudent().get());
		if(studentOptional.isPresent()) {
			Optional<String> opt = studentOptional
							.filter(student -> student.getGpa() > 3.5)
							.flatMap(Student::getBike)
							.map(Bike::getName);
			System.out.println(opt.get());
		}
		
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
