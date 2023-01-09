package edu.dio.poo.chat.app;

public class Telegram extends ChatService {
    public void sendMessage() {
        if (!isConnection())
            isSendMessage();

        System.out.println("Mensagem enviada Telegram");
        isSendMessage();
    }

    public void receiveMessage() {
        if (!isConnection())
            isReceiveMessage();

        System.out.println("Mensagem recebida Telegram");
        isReceiveMessage();
    }

}
