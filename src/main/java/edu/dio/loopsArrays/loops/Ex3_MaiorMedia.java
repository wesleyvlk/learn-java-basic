package edu.dio.loopsArrays.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorMedia {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int numero;
            int soma = 0;
            int maior = 0;
            int media = 5;
            int count = 0;
            do {
                System.out.print("\n  Numero: ");
                numero = scanner.nextInt();
                soma += numero;
                if (numero > maior)
                    maior = numero;
                count++;
            } while (count < media);
            media = soma / media;
            System.out.println("\n    Media: " + media);
            System.out.println("    Maior: " + maior + "\n");
        } catch (java.util.InputMismatchException e1) {
            System.out.println("\n  Digite apenas números... \n");
        }
    }
}
