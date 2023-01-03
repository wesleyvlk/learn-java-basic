package br.edu.dio.collections.dicas;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

}

class TestaCurso {
    public static void main(String[] args) {
        TestaCurso tCurso = new TestaCurso();
        tCurso.aulas();
    }

    private void aulas() {
        Curso javaColecoes = new Curso("Dominando coleções em Java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();

        //vazio
        // System.out.println(aulas);

        // evitado por exception UnsupportedOperationException
        // javaColecoes.getAulas().add(new Aula(null, 0));

        // correto usando metodo criado adiciona()  
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

        System.out.println(javaColecoes.getAulas());
    }
}
