package loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeIdade {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        int age;
        while (true) {
            System.out.print("\n  Nome: ");
            name = scanner.next();
            if (name.equals("0"))
                break;
            System.out.print("  Idade: ");
            age = scanner.nextInt();
        }
        System.out.println("Continue aqui... \n");
        scanner.close();
    }
}