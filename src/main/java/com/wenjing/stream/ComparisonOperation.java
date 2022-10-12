package com.wenjing.stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ComparisonOperation {
    private static Stream<Employee> employeeStream;

    @Before
    public void concreateEmployeeStream() {
        Employee[] employees = {
                new Employee(1, "Tom", 200000.0),
                new Employee(2, "Jerry", 100000.0),
                new Employee(3, "Lily", 300000.0)
        };
        employeeStream = Stream.of(employees);
    }

    @Test
    public void sorted() {
        employeeStream
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .forEach(System.out::println);
    }

    @Test
    public void min() {
        Optional<Employee> employee = employeeStream
                .min((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(employee);
    }

    @Test
    public void distinct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5, 6);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void match() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean allMatch = numbers.stream().allMatch(e -> e % 2 == 0);
        boolean anyMatch = numbers.stream().anyMatch(e -> e % 2 == 0);
        boolean noneMatch = numbers.stream().noneMatch(e -> e % 2 == 0);
        System.out.println("allMatch : " + allMatch);
        System.out.println("anyMatch : " + anyMatch);
        System.out.println("noneMatch : " + noneMatch);
    }

    @Test
    public void mapToInt() {
        employeeStream
                .mapToInt(Employee::getId)
                .forEach(System.out::println);
    }

    @Test
    public void mapToDouble() {
        employeeStream
                .mapToDouble(Employee::getSalary)
                .forEach(System.out::println);
    }

    @Test
    public void longStream() {
        employeeStream
                .mapToLong(Employee::getId)
                .forEach(System.out::println);
    }

    @Test
    public void max() {
        Long id = employeeStream
                .mapToLong(Employee::getId)
                .max()
                .orElse(-1);
        Assert.assertEquals(id, Long.valueOf(3));
    }
    
}
