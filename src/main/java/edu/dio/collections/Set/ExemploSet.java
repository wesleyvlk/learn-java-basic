package edu.dio.collections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(final String[] args) {
        final Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7.0, 0.0, 3.6));
        System.out.println("Crie um conjunto e adicione as sete notas: " + notas.toString());

        // System.out.println("Exiba a posição da nota 5.0: "); nao é possivel usar
        // indexOf com HashSet

        // System.out.println("Adicione no conjunto a nota 8.0 na posição 4: "); nao é
        // possivel definir posicoes com HashSet

        // System.out.println("Substitua a nota 5.0 pela nota 6.0: "); nao é possivel
        // usar set com HashSet

        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        // System.out.println("Exiba a terceira nota adicionada: "); nao é possivel
        // HashSet adiciona de forma aleatoria

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        final Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            final double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        notas.remove(0d);
        System.out.println("Remova a nota 0: " + notas);

        // System.out.println("Remova a nota da posição 0"); não é possivel buscar para
        // remover por index com HashSet

        final Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            final double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba o conjunto: " + notas);

        final Set<Double> notas2 = new LinkedHashSet<>() {
            {
                add(7d);
                add(8.5);
                add(9.3);
                add(5d);
                add(7.0);
                add(0d);
                add(3.6);
            }
        };
        System.out.println("Exiba todas as notas na ordem em que foram informados: " + notas2);

        final Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Exima todas as notas na ordem crescente: " + notas3);

        System.out.println("Apague todo o conjunto...");
        notas.clear();
        System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty() + " = " + notas);
        System.out.println("Confira se o conjunto 2 esta vazio: " + notas2.isEmpty() + " = " + notas2);
        System.out.println("Confira se o conjunto 3 esta vazio: " + notas3.isEmpty() + " = " + notas3);

    }
}