package edu.dio.poo.chat.app;

public class FacebookMessenger extends ChatService {
    public void sendMessage() {
        if (!isConnection())
            isSendMessage();

        System.out.println("Mensagem enviada Facebook Messenger");
        isSendMessage();
    }

    public void receiveMessage() {
        if (!isConnection())
            isReceiveMessage();

        System.out.println("Mensagem recebida Facebook Messenger");
        isReceiveMessage();
    }
}