package br.edu.dio.metodos.criacao;

public class Message {
    static void getMessage(int hora) {
        boolean morning = hora >= 5 && hora <= 11;
        boolean afternoon = hora >= 12 && hora <= 17;
        boolean night = hora <= 24 & hora >= 0;
        if (morning) {
            messageMorning();
        } else if (afternoon) {
            messageAfternoon();
        } else if (night) {
            messageNight();
        } else {
            System.out.println("Hora invalida");
        }
    }

    static void messageMorning() {
        System.out.println("Bom dia");
    }

    static void messageAfternoon() {
        System.out.println("Boa tarde");
    }

    static void messageNight() {
        System.out.println("Boa noite");
    }

}
