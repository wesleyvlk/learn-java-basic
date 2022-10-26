import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParImpar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        int count = 0;
        boolean calcParImpar;

        System.out.println("\n  Quantidade de números: ");
        quantNumeros = scanner.nextInt();
        do {
            System.out.print("\n  Numero: ");
            numero = scanner.nextInt();
            calcParImpar = numero % 2 == 0;
            if (calcParImpar)
                quantPares++;
            else
                quantImpares++;
            count++;
        } while (count < quantNumeros);
        System.out.println("\n    Quantidade pares: " + quantPares);
        System.out.println("    Quantidade impares: " + quantImpares + "\n");
    }
}
