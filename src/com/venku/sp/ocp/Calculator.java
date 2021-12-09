package com.venku.sp.ocp;

import java.security.InvalidParameterException;

public class Calculator {

// below code voilates the ocp if we add multiplication and division again
//    public void calculate(CalculatorOperation operation) {
//        if (operation == null) {
//            throw new InvalidParameterException("Can not perform operation");
//        }
//
//        if (operation instanceof Addition) {
//            Addition addition = (Addition) operation;
//            addition.setResult(addition.getLeft() + addition.getRight());
//        } else if (operation instanceof Subtraction) {
//            Subtraction subtraction = (Subtraction) operation;
//            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
//        }
//    }


    public Calculator(CalculatorOperation calculatorOperation) {

        if (calculatorOperation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        calculatorOperation.perform();
    }

    public static void main(String[] args) {
        new Calculator(new Addition(10,20));
        new Calculator(new Subtraction(30,40));
        new Calculator(new Multiplication(50,2));
    }
}
