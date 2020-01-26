package com.sethjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 50000.00),
                new Employee("Susan", 60000.00),
                new Employee("Richard", 70000.00)
        );

        BiConsumer<Employee, Double> biConsumer = (employee, increment) -> employee.salary = employee.salary + increment;
        employeeList.forEach(employee -> {
            biConsumer.accept(employee, 1500.00);
            System.out.println(employee.name + " :: "+employee.salary);
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