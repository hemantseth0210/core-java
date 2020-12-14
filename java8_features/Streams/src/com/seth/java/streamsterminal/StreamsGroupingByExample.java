package com.seth.java.streamsterminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seth.java.data.Student;
import com.seth.java.data.StudentDataBase;

public class StreamsGroupingByExample {

	
	public static void groupStudentByGender() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	public static void customizedGroupingBy() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE"));
		
		System.out.println(studentMap);
	}
	
	public static void twoLevelGroupingBy_1() {
		
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
		
		System.out.println(studentMap);
	}
	
	public static void twoLevelGroupingBy_2() {
		
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
												.stream()
												.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		groupStudentByGender();
		customizedGroupingBy();
		twoLevelGroupingBy_1();
		twoLevelGroupingBy_2();
	}

}
