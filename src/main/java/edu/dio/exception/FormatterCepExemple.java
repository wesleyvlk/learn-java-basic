package edu.dio.exception;

import java.time.format.FormatStyle;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class FormatterCepExemple {
    static String formatCep(String cep) throws CepInvalidException {
        if (cep.length() != 8)
            throw new CepInvalidException();

        return "22.333-444";
    }

    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("Digite se CEP: [Apenas números] ");
            String formattedCep = formatCep("22333444");
            System.out.println(formattedCep);
            System.out.println();
        } catch (Exception e) {
            System.out.println();
            System.out.println("CEP invalido, digite um CEP correspondente. [Apenas números] ");
            System.out.println();
        }
    }
}
