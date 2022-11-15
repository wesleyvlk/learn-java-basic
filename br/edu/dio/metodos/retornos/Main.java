package br.edu.dio.metodos.retornos;

public class Main {
    public static void main(String[] args) {
        double areaSquare = Quadrilatero.area(3);
        double areaRectangle = Quadrilatero.area(5d, 5d);
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        float areaDiamond = Quadrilatero.area(5f, 5f);

        System.out.println();
        System.out.println("Exercício quadrilátero");
        System.out.println("Area do quadrado: " + areaSquare);
        System.out.println("Area do retangulo: " + areaRectangle);
        System.out.println("Area do trapezio: " + areaTrapezio);
        System.out.println("Area do losango: " + areaDiamond);
        System.out.println();
    }
}   