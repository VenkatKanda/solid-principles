package com.venku.sp.ocp;

public class Multiplication implements CalculatorOperation{

    private int right;

    private int left;

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

    public Multiplication(int right, int left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public void perform() {
        System.out.println(this.right*this.left);
    }
}
