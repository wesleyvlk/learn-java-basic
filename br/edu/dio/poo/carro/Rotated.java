package br.edu.dio.poo.carro;

import br.edu.dio.poo.carro.vehicle.Car;

public class Rotated {

    public static void main(String[] args) {
        Car gol = new Car();
        gol.setColor("Black Ninja");
        gol.setModel("Volkswagen Gol Last Edition 1.0 2022");
        gol.setMaxCapFuel(20);

        System.out.println();
        System.out.println(gol.getColor());
        System.out.println(gol.getModel());
        System.out.println("" + gol.getMaxCapFuel());
        System.out.println("R$ " + String.format("%.2f", gol.tankValue(5.06)));

        Car mobi = new Car("Red Montecarlo", "Fiat Mobi Like 1.0 2022", 40);

        System.out.println();
        System.out.println(mobi.getColor());
        System.out.println(mobi.getModel());
        System.out.println(mobi.getMaxCapFuel());
        System.out.println("R$ " + String.format("%.2f", mobi.tankValue(5.06)));
        System.out.println();

    }
}