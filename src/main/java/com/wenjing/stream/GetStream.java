package com.wenjing.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Tom", 100000.0),
                new Employee(2, "Jerry", 200000.0),
                new Employee(3, "Lily", 300000.0)
        };
        //1. NO 1
        Stream<Employee> employeeStream1 = Stream.of(employees);

        //2. NO 2
        List<Employee> employeeList = Arrays.asList(employees);
        Stream<Employee> employeeStream2 = employeeList.stream();

        //3. NO 3
        Stream<Employee> employeeStream3 = Stream.of(employees[0], employees[1], employees[2]);

        //4. NO 4
        Stream.Builder<Employee> builder = Stream.builder();
        builder.accept(new Employee(1, "Tom", 100000.0));
        builder.accept(new Employee(2, "Jerry", 200000.0));
        builder.accept(new Employee(3, "Lily", 300000.0));
        Stream<Employee> employeeStream4 = builder.build();
    }


}
