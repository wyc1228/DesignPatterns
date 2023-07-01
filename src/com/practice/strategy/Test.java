package com.practice.strategy;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationAdd());
        System.out.println(calculator.doOperate(3, 2));
        calculator.setOperation(new OperationSub());
        System.out.println(calculator.doOperate(3, 2));
    }
}
