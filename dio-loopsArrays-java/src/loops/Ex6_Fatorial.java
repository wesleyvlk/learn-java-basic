package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int factor;
        int calc = 1;
            
        System.out.print("\n  Fatorial, Digite um numero: ");
        factor = scanner.nextInt();

        System.out.println("");
        System.out.print("    " + factor + "! = ");
        for (int i = factor; i >= 1; i--) {
            calc *= i;
        }
        System.out.println(calc + "\n");
    }
}
