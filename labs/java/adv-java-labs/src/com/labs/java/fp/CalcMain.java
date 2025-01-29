package com.labs.java.fp;

import java.util.function.BiFunction;

public class CalcMain {
    public static void main(String[] args) {
//        CalcOOP calc1 = new CalcOOP();
//        // Add - 100 + 250
//        calc1.setA(100);
//        calc1.setB(250);
//
//        System.out.println("100 + 250 = " + calc1.add());
//        System.out.println(calc1.substract()); // -150
//
//        // Add - 200 + 300
//        calc1.setA(200);
//        calc1.setB(300);
//        System.out.println("200 + 300 = " + calc1.add());
//        System.out.println(calc1.substract()); // - 100


        // Subtract - 300 - 250
        // Multiply - 50 * 20
        // Divide - 100 / 20

//        CalcFP calc2 = new CalcFP();
//        System.out.println("100 + 250 = " + calc2.add(100, 250));
//        System.out.println("200 + 300 = " + calc2.add(200, 300));
//
//        System.out.println("300 - 250 = " + calc2.substract(300, 250));
//        System.out.println("500 - 250 = " + calc2.substract(500, 250));

        Calc calc = new Calc();

        System.out.printf("Approach #1 - Separate Class for each operation");

        MathOperation add = new AddOperation();
        MathOperation subtract = new SubstractOperation();
        System.out.println("100 + 250 = " + calc.compute(100, 250, add));
        System.out.println("300 - 250 = " + calc.compute(300, 250, subtract));

        System.out.printf("Approach #2 - Anonymous Inner Class");

        MathOperation add1 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        MathOperation subtract1 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        };

        System.out.println("100 + 250 = " + calc.compute(100, 250, add1));
        System.out.println("300 - 250 = " + calc.compute(300, 250, subtract1));

        // Approach #3: Lambda Expression
        System.out.println("Approach #3 - Lambda Expression");

        MathOperation add2 = (int a, int b) -> { return a - b;};
        MathOperation subtract2 = (a, b) ->  a - b;
        System.out.println("100 + 250 = " + calc.compute(100, 250, add2));
        System.out.println("300 - 250 = " + calc.compute(300, 250, subtract2));

        // Approach #4: Built-in Functional Interfaces
        System.out.println("Approach #4 - Built-in Functional Interfaces");

        BiFunction<Integer,Integer,Integer> add3 = (a, b) -> { return a + b;};
        System.out.println("100 + 250 = " + add3.apply(100, 250));
    }
}
