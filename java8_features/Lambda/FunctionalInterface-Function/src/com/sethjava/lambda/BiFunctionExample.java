package com.sethjava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, String, Employee> biFunction = (eno, ename) -> new Employee(eno, ename);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(biFunction.apply(100, "John"));
        employeeList.add(biFunction.apply(200, "Richie"));
        employeeList.add(biFunction.apply(300, "Susan"));
        employeeList.forEach(employee -> System.out.println(employee.eno +" :: " + employee.name));
    }
}

class Employee{
    int eno;
    String name;
    public Employee(int eno, String name) {
        super();
        this.eno = eno;
        this.name = name;
    }

}