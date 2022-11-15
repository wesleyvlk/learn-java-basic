package br.edu.dio.loopsArrays.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] storeRNumbers = new int[20];
        for (int i = 0; i < storeRNumbers.length; i++) {
            storeRNumbers[i] = random.nextInt(101);
        }
        System.out.print("\n             int[] storeRNumbers = ");
        for (int hasRNumbers : storeRNumbers) {
            System.out.print(hasRNumbers + " ");
        }
        System.out.print("\n  Antecessor int[] storeRNumbers = ");
        for (int hasRNumbers : storeRNumbers) {
            System.out.print((hasRNumbers - 1) + " ");
        }
        System.out.print("\n    Sucessor int[] storeRNumbers = ");
        for (int hasRNumbers : storeRNumbers) {
            System.out.print((hasRNumbers + 1) + " ");
        }
        System.out.println("\n");
    }
}
