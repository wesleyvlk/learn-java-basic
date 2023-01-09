package edu.dio.loopsArrays.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { -5, -6, 50, 25, 4, 6 };

        System.out.print("\n  Vetor[] = ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
    }
}
