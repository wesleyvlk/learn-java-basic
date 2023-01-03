package br.edu.dio.collections.dicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula implements Comparable<Aula> {
    private final String titulo;
    private final int tempo;

    public Aula(final String titulo, final int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(final Aula outraAula) {
        return this.titulo.compareToIgnoreCase(outraAula.titulo);
    }

}

class TestandoListaDeAula {
    public static void main(final String[] args) {
        final TestandoListaDeAula TListAula = new TestandoListaDeAula();
        System.out.println();
        TListAula.aulas();
        System.out.println();
    }

    private void aulas() {
        final Aula aula1 = new Aula("Revistando as ArrayLists", 21);
        final Aula aula2 = new Aula("Listas de objetos", 20);
        final Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);

        final List<Aula> aulas = new ArrayList<>() {
            {
                add(aula1);
                add(aula2);
                add(aula3);
            }
        };

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }

}