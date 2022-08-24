package com.wenjing.functionalInterfaces;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = radius -> Math.PI * radius * radius;
        double circleArea = circle.calculateArea(3);
        System.out.println("Circle area is : " + circleArea);
    }
}