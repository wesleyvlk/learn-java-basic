package edu.dio.loopsArrays.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int table = 1;
        int count = 10;
        boolean rule;
        int calc;

        System.out.print("\n  Tabuada, Digite um numero de 1 a 10: ");
        table = scanner.nextInt();
        
        System.out.println("");
        rule = (table > 0) && (table <= count);
        if (rule) {
            for (int i = 1; i <= count; i++) {
                calc = i * table;
                System.out.println("    " + table + " X " + i + " = " + calc);
            }
        } else
            System.out.println("    Numero indefinido");
        System.out.println("");
    }
}
