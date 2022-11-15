package br.edu.dio.exception;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("Digite seu nome");
            String firstName = scanner.next();
            System.out.println();
            System.out.println("Digite seu sobrenome");
            String lastName = scanner.next();
            System.out.println();
            System.out.println("Digite sua idade");
            int age = scanner.nextInt();
            System.out.println();
            System.out.println("Digite sua altura");
            double height = scanner.nextDouble();

            System.out.println();
            System.out.println("Olá, me chamo " + firstName.toUpperCase() + " " + lastName.toUpperCase());
            System.out.println("Tenho " + age + " anos ");
            System.out.println("Minha altura é " + height + "cm ");
            System.out.println();
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println();
            System.err.println("Os dados idade e altura precisão ser numéricos!...");
            System.err.println();
        }
    }
}