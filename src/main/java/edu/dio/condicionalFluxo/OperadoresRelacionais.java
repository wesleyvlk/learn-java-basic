package edu.dio.condicionalFluxo;

public class OperadoresRelacionais {
    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char x1 = 'x';
        char x2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = true;
        
        System.out.println("\nverificação inteiros");
        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));
        System.out.println("i1 >= i2 " + (i1 >= i2));
        System.out.println("\nverificação float");
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("\nverificação char");
        System.out.println("x1 == x2 " + (x1 == x2));
        System.out.println("x1 != x2 " + (x1 != x2));
        System.out.println("x1 <= x2 " + (x1 <= x2));
        System.out.println("x1 >= x2 " + (x1 >= x2));
        System.out.println("\nverificação string");
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
        System.out.println("\nverificação boolean");
        System.out.println("b1 == b2" + (b1 == b2));
        System.out.println("b1 != b2" + (b1 != b2));
        System.out.println("\nverificação float e inteiro");
        System.out.println("f1 == i1 " + (f1 == i1));
        System.out.println("f1 != i1 " + (f1 != i1));
        System.out.println("f1 <= i1 " + (f1 <= i1));
        System.out.println("f1 >= i1 " + (f1 >= i1));

    }
}
