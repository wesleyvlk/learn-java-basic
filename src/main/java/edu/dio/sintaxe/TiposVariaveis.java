package edu.dio.sintaxe;
public class TiposVariaveis {
    public static void main(String[] args) {
        // mil em .
        float $realSalarioMinimo = 1212.00f; // float precisa ter o f no final
        float $salarioMinimo = 2.500f; // o correto seria 2500.0f esse representa 002.5f

        // fortemente tipado
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // um numero short cabe dentro de um int ok
        short numeroCurto2 = (short) numeroNormal; // esse caso errado tendo de fazer um cat()

        final double VALOR_DE_PI = 3.14; // final é uma constante escrito em MAIUSCULO _

        
    }
}
