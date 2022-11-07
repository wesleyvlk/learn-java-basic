package arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] consonants = new String[6];
        String letter;
        int count = 0;
        int qtdConsonants = 0;
        boolean ignoreVowels;
        do {
            System.out.print("\n  Digite apenas uma Letra: [6 vezes (" + (count + 1) + "*)] ");
            letter = scanner.next();
            ignoreVowels = !((letter.equalsIgnoreCase("a")) ||
                    (letter.equalsIgnoreCase("e")) ||
                    (letter.equalsIgnoreCase("i")) ||
                    (letter.equalsIgnoreCase("o")) ||
                    (letter.equalsIgnoreCase("u")));
            if (ignoreVowels) {
                consonants[count] = letter;
                qtdConsonants++;
            }
            count++;
        } while (count < consonants.length);
        System.out.print("\n    Consoantes: ");
        for (String hasConsonants : consonants) {
            if (hasConsonants != null)
                System.out.print(hasConsonants + " ");
        }
        System.out.println("\n    Quantidade de consoantes: " + qtdConsonants);
        System.out.println("");

    }
}