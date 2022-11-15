package br.edu.dio.loopsArrays.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo
 * até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int nota = 0;
        System.out.println("\n  Digite uma nota de 0 a 10 para iniciar: ");

        try {
            nota = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\n    Por favor digite apenas números...");
            main(args);
        }
        while (nota < 0 || nota > 10) {
            System.out.println("\n    Nota indefinida...");
            System.out.println("\n  Digite uma nota de 0 a 10: ");
            nota = scanner.nextInt();
        }
    }
}