package com.sethjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Sunny", 40000.00),
                new Employee("Danny", 65000.00),
                new Employee("Eric", 75000.00),
                new Employee("Richard", 45000.00),
                new Employee("Susan", 55000.00),
                new Employee("Bella", 78000.00));

        Predicate<Employee> predicate = e -> e.name.length() == 5 && e.salary > 50000.00;
        employeeList.forEach(e -> {
            if(predicate.test(e)) {
                System.out.println(e.name + " : " + e.salary);
            }
        });
    }
}

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
}