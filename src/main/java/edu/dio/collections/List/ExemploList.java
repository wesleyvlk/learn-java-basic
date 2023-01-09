package edu.dio.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
    Listas exemplos, basicamente Arraylist e LinkedList sao implementações de List que extende Collections. Tendo como funçao formar listas mapeaveis e serializaveis e dinamicas.
    add - adiciona(com o index de posicao do array, e &, com o argumento da lista)
    remove - remove(com o index de posicao em array, ou || ,com o argumento da lista)
    set - substitui(com o index de posicao do array, e &, com o argumento da lista)
    .indexOf - seleciona(com o argumento da lista)
 */
public class ExemploList {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Crie uma lista e adicione as sete notas: " + notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println("Remova da lista a nota 7.0 da posição 5: ");
        notas.remove(5);
        System.out.println("Remova da lista a nota 7.0 da posição 1: ");
        notas.remove(7d);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(2, 6d);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
            System.out.println(soma);
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));
        System.out.println("Remova a nota 0: ");
        System.out.println(notas);
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        notas.clear();
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        List<Double> notas1 = new LinkedList<>();
        notas1.add(10d);
        notas1.add(1, 7d);
        notas1.set(0, 9d);
        notas1.remove(0);
        notas1.add(0, 10d);
        notas1.remove(10d);
        notas1.set(0, 9d);
        System.out.println(notas1);
    }
}
