package br.edu.dio.metodos.smartTV;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SmartTV {
    boolean power = false;
    int channel = 2;
    int volume = 0;

    public void Power_ON() {
        if (power == false) {
            power = true;
            System.out.println("Ligando... Smart TV...");
        }
        System.out.println("Canal atual: " + channel);
        Status_Volume();
    }

    public void Power_OFF() {
        System.out.println("Desligando... Smart TV.");
        power = false;
    }

    public void Status_OK() {
        Power_ON();
    }

    public void Channel_Set() {
        if (power == false) {
            Status_OK();
        }
        double newChannel = channel;
        try {
            System.out.print("Escolhendo Canal: ");
            Scanner setValue = new Scanner(System.in);
            newChannel = setValue.nextInt();
            channel = (int) newChannel;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Canal invalido");
        }
        if (newChannel <= 2) {
            channel = 2;
        } else if (newChannel >= 50) {
            channel = 50;
        }
        System.out.println("Canal atual: " + channel);
    }

    public void Channel_Up() {
        if (power == false) {
            Status_OK();
        }
        if (channel >= 50) {
            channel = 2;
        } else {
            channel++;
        }
        System.out.println("Canal atual: " + channel);
    }

    public void Channel_Down() {
        if (power == false) {
            Status_OK();
        }
        if (channel <= 2) {
            channel = 50;
        } else {
            channel--;
        }
        System.out.println("Canal atual: " + channel);
    }

    public void Volume_Up() {
        if (power == false) {
            Status_OK();
        }
        volume = volume + 10;
        Status_Volume();
    }

    public void Volume_Down() {
        if (power == false) {
            Status_OK();
        }
        volume = volume - 10;
        Status_Volume();
    }

    public void Status_Volume() {
        if (volume >= 100) {
            volume = 100;
            System.out.println("Volume maximo");
        } else if (volume <= 0) {
            volume = 0;
            System.out.println("Volume mudo");
        } else {
            System.out.println("Volume atual: " + volume);
        }
    }

}