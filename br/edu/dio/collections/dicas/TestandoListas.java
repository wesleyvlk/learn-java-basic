package br.edu.dio.collections.dicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

    public static void main(final String[] args) {
        final TestandoListas aulas = new TestandoListas();
        aulas.aulas();
    }

    private void aulas() {
        final List<String> aulas = new ArrayList<>() {
            String aula1 = "Modelando a classe Aula";
            String aula2 = "Conhecendo mais de listas";
            String aula3 = "Trabalhando com Cursos e Sets";
            {
                add(aula1);
                add(aula2);
                add(aula3);
            }
        };
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
        
        aulas.remove(0);
        System.out.println("Depois de removido index 0:");
        System.out.println(aulas);

        for (final String aula : aulas) {
            System.out.println("Each Aula: " + aula);
        }

        // nunca <= resultado exception IndexOutOfBoundsException
        // cuidado! <= faz sentido aqui?
        // em collections sempre utilizar size e nao length
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("i Aula: " + aulas.get(i));
        }

        final String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula: " + primeiraAula);

        //parte interessante metodo de collections um forEach elegante
        aulas.forEach(aula -> {
            System.out.println("Percorrendo ...");
            System.out.println("Aula " + aula);
        });
        
    }
}
