package be.fai;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator addition = new Calculator(2, 3);
        System.out.println();
        addition.addition();
        addition.subtration();
        addition.setNumber1(5);
        addition.subtration();
        addition.multiplication();
        addition.division();
        addition.modulus();
    }
}
