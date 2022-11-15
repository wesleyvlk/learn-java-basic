package retornos;

public class Quadrilatero {
    public static double area(double side) {
        return side * side;
    }

    public static double area(double side1, double side2) {
        return side1 * side2;
    }

    public static double area(double baseLarger, double baseSmaller, double height) {
        return ((baseLarger + baseSmaller) * height) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    public void xpto(int i ){

    }
}
