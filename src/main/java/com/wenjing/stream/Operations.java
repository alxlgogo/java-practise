package com.wenjing.stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * terminal operation, which means that, after the operation is performed,
 * the stream pipeline is considered consumed, and can no longer be used.
 */
public class Operations {
    private static Stream<Employee> employeeStream;

    @Before
    public void concreateEmployeeStream() {
        Employee[] employees = {
                new Employee(1, "Tom", 100000.0),
                new Employee(2, "Jerry", 200000.0),
                new Employee(3, "Lily", 300000.0)
        };
        employeeStream = Stream.of(employees);
    }


    /**
     * terminal operation
     */
    @Test
    public void forEach() {
        employeeStream.forEach(employee -> {
            employee.increaseSalary(10000);
            System.out.println(employee.getSalary());
        });
    }

    /**
     * we need to perform multiple operations on each element of the stream
     * before any terminal operation is applied.
     */
    @Test
    public void peek() {
        employeeStream
                .peek(employee -> employee.increaseSalary(100))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    @Test
    public void map1() {
        employeeStream.map(employee -> {
            employee.increaseSalary(10000);
            return employee;
        }).forEach(e -> System.out.println(e));
    }

    @Test
    public void map2() {
        employeeStream
                .map(employee -> employee.getName()).
                forEach(System.out::println);
    }

    @Test
    public void filter() {
        employeeStream
                .filter(employee -> employee.getSalary() > 1100000 && "Lily".equals(employee.getName()))
                .forEach(employee -> System.out.println(employee));
    }

    /**
     * Terminal Operation
     */
    @Test
    public void findFirst() {
        Employee employee1 = employeeStream.map(employee -> {
                    employee.increaseSalary(100);
                    return employee;
                })
                .filter(employee -> employee.getSalary() > 210000)
                .findFirst()
                .orElse(null);
        System.out.println(employee1);
    }

    /**
     * terminal operation
     */
    @Test
    public void collect() {
        List<Employee> collect = employeeStream
                .filter(employee -> employee.getSalary() > 100000)
                .collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }

    /**
     * The syntax Employee[]::new creates an empty array of Employee –
     * which is then filled with elements from the stream.
     */
    @Test
    public void toArray() {
        Employee[] employees = employeeStream.toArray(Employee[]::new);
    }

    @Test
    public void flatMap() {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("Tom", "Toni"),
                Arrays.asList("Lily", "Lucy")
        );
        List<String> newNames = names.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        Assert.assertEquals(names.size() * 2, newNames.size());
    }

    /**
     * short-circuiting operation
     */
    @Test
    public void skip() {
        employeeStream
                .filter(employee -> employee.getSalary() > 80000)
                .skip(2)
                .forEach(System.out::println);
    }

    /**
     * short-circuiting operation
     */
    @Test
    public void limit() {
        employeeStream
                .limit(2)
                .forEach(System.out::println);
    }


}
