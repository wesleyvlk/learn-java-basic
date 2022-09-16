import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

public class SintaxBasic {
    public static void main(String[] args) {
        // Sintaxe basica Java
        // TipoDaVariavel nomeDaVariavel = "Declarando Variavel";
        String myName = "Wesley";
        System.out.print("Hello, " + myName);

        // Variaveis Numericas:
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b; // cast: (float)
        System.out.println(soma); // atalho 'sout'
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        // Operadores Boolean:
        Boolean fimDeSemana = true;
        Boolean fazSol = true;
        Boolean vamosPraia = fimDeSemana && fazSol;
        System.out.println(vamosPraia);

        // Operador Boolean &&(AND):
        // true && true = true;
        // true && false = false;
        // false && true = false;
        // false && false = false;
        // Operador Boolean ||(OR)
        // true || true = true;
        // true || false = true;
        // false || true = true;
        // false || false = false;

        // Ternario:
        String returnMessage = vamosPraia ? "Sabadou! Partiu praia!" : "Vai trabalhar maluco!";
        System.out.println(returnMessage);

        // Estrutura Condicionais If Else e Switch:
        int nota = 50;
        String graduacao = "C";
        if (nota >= 90) {
            System.out.println("Aluno Aprovado, Graduação A");
        } else if (nota >= 75) {
            System.out.println("Aluno Aprovado, Graduação B");
        } else if (nota <= 74) {
            System.out.println("Aluno Reprovado, Graduação C");
        } else if (nota <= 50) {
            System.out.println("Aluno Reprovado, Graduação D");
        } else {
            System.out.println("Valor invalido");
        }
        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

        // Manipulando String e Datas:
        LocalDate today = LocalDate.now();
        Locale brazil = new Locale("pt", "BR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String name = "Wesley";
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL,
                brazil);
        String date = today.format(formatter);
        String greeting = "Boa Noite";
        if (now.getHour() >= 6 && now.getHour() < 12) {
            greeting = "Bom Dia";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            greeting = "Boa Tarde";
        }
        System.out.printf("Olá! %s. Hoje é %s %s, %s;%n", name, dayOfWeek, date, greeting.toUpperCase());

        // Laços Numericos:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("Tabuada do " + i + ": " + i + "x" + j + "=" + i * j);
            }
        }
        // Arrays:
        int[] numeros = new int[5];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        String letras[] = { "A", "B", "C", "D", "E" };
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Expresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
        int[] calcMedia = { 50, 20, 2, 9, 6 };
        int menor = calcMedia[0];
        int maior = calcMedia[0];
        int media = 0;
        for (int i = 0; i < calcMedia.length; i++) {
            if (calcMedia[i] < menor) {
                menor = calcMedia[i];
            }
            if (calcMedia[i] > maior) {
                maior = calcMedia[i];
            }
            media += calcMedia[i];
        }
        System.out.println("menor " + menor);
        System.out.println("maior " + maior);
        System.out.println("media " + media / calcMedia.length);
    }
}