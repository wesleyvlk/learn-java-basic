package edu.dio.poo.intefaceCalculator;

public class Calculator implements MathOperation {
    
    @Override
    public void sum(Double operator1, Double operator2) {
        double sum = operator1 + operator2;
        System.out.println("Soma: " + operator1 + " + " + operator2 + " = " + sum);
    }

    @Override
    public void multiplication(Double operator1, Double operator2) {
        double sum = operator1 * operator2;
        System.out.println("Soma: " + operator1 + " * " + operator2 + " = " + sum);
    }

    @Override
    public void subtraction(Double operator1, Double operator2) {
        double sum = operator1 - operator2;
        System.out.println("Soma: " + operator1 + " - " + operator2 + " = " + sum);
    }

    @Override
    public void division(Double operator1, Double operator2) {
        double sum = operator1 / operator2;
        System.out.println("Soma: " + operator1 + " / " + operator2 + " = " + sum);
    }

}
