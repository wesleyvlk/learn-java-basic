package br.edu.letscode.introducao;
public class ClassMethodsFunctions {
    public static void main(String[] args) {
        String myNameIs = "Wesley";
        answer(myNameIs);
        int resultado = calc(20, 2);
        System.out.println(resultado);
    }
    public static void answer(String whatYourName) {
        System.out.println("Hello! " + whatYourName);
    }
    public static int calc(int a, int b) {
        return a + b;
    }
}