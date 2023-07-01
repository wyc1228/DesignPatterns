package com.practice.strategy;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperate(int num1, int num2){
        return this.operation.doOperation(num1,num2);
    }
}
