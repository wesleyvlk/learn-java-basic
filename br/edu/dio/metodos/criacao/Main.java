package br.edu.dio.metodos.criacao;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println();
        System.out.println("Exercício calculadora");
        Calculator.sum(3, 6);
        Calculator.subtraction(9, 1.8);
        Calculator.multiplication(7, 8);
        Calculator.division(5, 2.5);

        // Mensagem
        System.out.println();
        System.out.println("Exercício mensagem");
        Message.getMessage(7);
        Message.getMessage(14);
        Message.getMessage(-1);

        // Empréstimo
        System.out.println();
        System.out.println("Exercício empréstimo");
        Loan.calculate(1000, Loan.getTwoPayment());
        Loan.calculate(1000, Loan.getThreePayment());
        Loan.calculate(1000, 5);
        System.out.println();
    }
}
