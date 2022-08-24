package com.wenjing.functionalInterfaces;

public class TestSquare {
    public static void main(String[] args) {
        int a = 3;
        calculateSquareArea(a);
        calculateSquareAreaWithLambda(a);
    }

    //1. new functional Interface
    //2. override abstract method
    //3. call method
    public static void calculateSquareArea(int a) {
        Square square = new Square() {
            @Override
            public int calculateArea(int x) {
                return x * x;
            }
        };
        int area = square.calculateArea(a);
        System.out.println(area);
    }

    //1. use Lamda expression   parameter -> expression  , (parameter1, parameter2) -> expression
    // (int x) is parameter
    // x * x is the expression
    public static void calculateSquareAreaWithLambda(int a) {
        Square square = (int x) -> x * x;
        int squareArea = square.calculateArea(a);
        System.out.println("Square area is : " + squareArea);
    }

}
