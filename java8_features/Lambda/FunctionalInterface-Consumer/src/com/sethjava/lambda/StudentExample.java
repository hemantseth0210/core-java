package com.sethjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentExample {
    public static void main(String[] args) {
        Function<Student, String> function = student -> {
            Integer marks = student.marks;
            String grade = "";
            if(marks >= 75)
                grade = "A[Distinction]";
            else if(marks >= 60)
                grade = "B[First Class]";
            else if(marks >= 50)
                grade = "C[Second Class]";
            else if(marks >= 35)
                grade = "D[Third Class]";
            else
                grade = "Failed";

            return grade;
        };
        Predicate<Student> predicate = student -> student.marks >= 60;
        Consumer<Student> consumer = student -> System.out.println(student.name + " : " +student.marks + " : "
                + function.apply(student));

        List<Student> studentList = Arrays.asList(
                new Student("Richard", 67),
                new Student("Danny", 55),
                new Student("Eric", 85),
                new Student("Susan", 49),
                new Student("Greg", 27)
        );

        studentList.forEach(student -> {
            if(predicate.test(student))
                consumer.accept(student);
        });
    }
}

class Student{
    String name;
    Integer marks;
    public Student(String name, Integer marks) {
        super();
        this.name = name;
        this.marks = marks;
    }
}