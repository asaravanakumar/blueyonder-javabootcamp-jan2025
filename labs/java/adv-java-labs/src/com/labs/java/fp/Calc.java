package com.labs.java.fp;

public class Calc {
    public int compute(int a, int b, MathOperation operation) {
       return operation.operation(a, b);
    }
}
