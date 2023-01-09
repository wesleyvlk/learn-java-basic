package edu.dio.sintaxe;
import java.util.Date;

public class Operadores {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // operadores atribuicao
        String nome = "WESLEY"; // aspas duplas para string
        int idade = 22;
        double peso = 84.5;
        char sexo = 'M'; // aspas simples para char
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // operadores aritimeticos
        double soma = 24.2 + 25.7;
        int subtracao = 115 - 28;
        int multiplicacao = 405 * 402;
        double divisao = 85 / 5;
        double modulo = 85 % 5;
        double multCalculos = (454 * 55) + (524 / 56);

        // concatenacao
        String nomeLang = "Linguagem " + "JAVA";
        String fakeSoma = "24.2" + "25.7";
        String concatenar = "1" + 1 + 1 + 1;
        concatenar = "1" + (1 + 1 + 1);
        
        // operador unario
        int numero = 5;
        numero = -numero;
        numero = numero * -1;

        // increment decrement
        numero++;
        numero--;

        // invert
        boolean valorVerdadeiro = true;
        System.out.println(!valorVerdadeiro);

        // operadores logicos
        String nome1 = "Wesley";
        String nome2 = new String("Wesley");
        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 1;

        boolean condicao1 = true;
        boolean condicao2 = !false;
        
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira");
        }

    }
}
