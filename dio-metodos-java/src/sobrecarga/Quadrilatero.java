package sobrecarga;

public class Quadrilatero {
    public static void area(double side) {
        System.out.println("Area de quadrado: " + side * side);
    }

    public static void area(double side1, double side2) {
        System.out.println("Area do retangulo: " + side1 * side2);
    }

    public static void area(double baseLarger, double baseSmaller, double height) {
        System.out.println("Area do trapezio: " + ((baseLarger + baseSmaller) * height) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}
