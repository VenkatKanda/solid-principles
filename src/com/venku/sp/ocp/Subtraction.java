package com.venku.sp.ocp;

public class Subtraction implements CalculatorOperation{

    private int right;

    private int left;

    public Subtraction(int right, int left) {
        this.right = right;
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    @Override
    public void perform() {
        System.out.println(this.left - this.right);
    }
}
