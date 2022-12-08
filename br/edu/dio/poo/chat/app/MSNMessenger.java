package br.edu.dio.poo.chat.app;

public class MSNMessenger extends ChatService {
    public void sendMessage() {
        if (!isConnection())
            isSendMessage();

        System.out.println("Mensagem enviada MSN");
        isSendMessage();
    }

    public void receiveMessage() {
        if (!isConnection())
            isReceiveMessage();

        System.out.println("Mensagem recebida MSN");
        isReceiveMessage();
    }
}