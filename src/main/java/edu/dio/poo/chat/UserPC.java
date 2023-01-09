package edu.dio.poo.chat;

import edu.dio.poo.chat.app.ChatService;
import edu.dio.poo.chat.app.FacebookMessenger;
import edu.dio.poo.chat.app.MSNMessenger;
import edu.dio.poo.chat.app.Telegram;

public class UserPC {

    public static void main(String[] args) {
        ChatService chatS = null;
        String app = "tlg";

        System.out.println("");

        switch (app.toUpperCase().toLowerCase()) {
            case "msn":
                chatS = new MSNMessenger();
                break;
            case "fbm":
                chatS = new FacebookMessenger();
                break;
            case "tlg":
                chatS = new Telegram();
                break;
            default:
                System.out.println("Invalido");
                break;
        }

        if (chatS != null) {
            System.out.println(chatS.getClass());
            chatS.sendMessage();
            chatS.receiveMessage();
        }

        System.out.println();

    }
}
