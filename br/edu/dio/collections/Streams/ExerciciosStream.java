package br.edu.dio.collections.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStream {
        public static void main(final String[] args) {
                final List<String> allNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
                System.out.println("Imprima todos os elementos dessa lista de String: ");

                // Classe Anonima: stream.forEach(Consumer<String>() {accept {sysout(accept)}});
                // allNumbers.stream().forEach(new Consumer<String>() {
                // public void accept(String streamAllNumbers) {
                // System.out.println(streamAllNumbers);
                // };
                // });

                // Lambda: stream.forEach(accept -> sysout(accept));
                // allNumbers.stream().forEach(streamAllNumbers ->
                // System.out.println(streamAllNumbers));

                // Reference Method: stream.forEach(systout::(accept));
                allNumbers.stream().forEach(System.out::println);

                System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

                final Set<String> allNumbersFirst5 = allNumbers.stream()
                                .limit(5)
                                .collect(Collectors.toSet());
                System.out.println(allNumbersFirst5);

                System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
                final List<Integer> allNumbers1 = allNumbers.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
                allNumbers1.forEach(System.out::println);

                System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
                final List<Integer> listLargerPairs2 = allNumbers.stream()
                                .map(Integer::parseInt)
                                .filter(i -> ((i % 2 == 0) && (i > 2)))
                                .collect(Collectors.toList());
                System.out.println(listLargerPairs2);

                System.out.println("Mostre a média dos números: ");
                allNumbers.stream()
                                .mapToInt(Integer::parseInt)
                                .average()
                                .ifPresent(System.out::println);

                System.out.println("Remova os valores ímpares: ");

                allNumbers1.removeIf(i -> (i % 2 != 0));
                System.out.println(allNumbers1);
        }
}