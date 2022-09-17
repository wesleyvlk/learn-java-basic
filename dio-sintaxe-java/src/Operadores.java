import java.util.Date;

public class Operadores {
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
        String nomeLang = "Linguagem" + "JAVA";
        String fakeSoma = "24.2" + "25.7";

        // operador unario
        int numero = 5;
        numero = -numero;
        numero = numero * -1;
    }
}
