package be.fai;

public class Calculator {
    //Properties
    private double number1;
    private double number2;

    //Constructor no-args
    public Calculator() {

    }

    //Constructor all-args
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //getters and setters

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }


    //Methodes

    //Addition
    public void addition() {
        System.out.println(this.number1 + "+" + this.number2 + " = " + (this.number1 + this.number2));
    }

    //Subtraction
    public void subtration() {
        System.out.println(this.number1 + "-" + this.number2 + " = " + (this.number1 - this.number2));
    }

    //Multiplication
    public void multiplication() {
        System.out.println(this.number1 + "*" + this.number2 + " = " + (this.number1 * this.number2));

    }

    //Division
    public void division() {
        double resDiv = this.number1 * number2;
        System.out.println(this.number1 + "/" + this.number2 + " = " + (Math.round(this.number1 / this.number2)));
    }

    //Modulus
    public void modulus() {
        System.out.println(this.number1 + "%" + this.number2 + " = " + (this.number1 % this.number2));
    }


}

