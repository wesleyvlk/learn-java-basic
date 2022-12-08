package br.edu.dio.poo.chat.app;

public abstract class ChatService {
    private boolean connection;
    private String status = "offline";
    private boolean sendMessage;
    private boolean receiveMessage;

    public ChatService() {
    }

    protected boolean isConnection() {
        if (!connection)
            setConnection();
        return connection;
    }

    private void setConnection() {
        setStatus(status = "online");
        System.out.println(getStatus());
        this.connection = true;
    }

    private String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    protected boolean isSendMessage() {
        setSendMessage(sendMessage);
        return sendMessage;
    }

    private void setSendMessage(boolean sendMessage) {
        sendMessage = true;
        historicMessage(sendMessage);
        this.sendMessage = sendMessage;
    }

    protected boolean isReceiveMessage() {
        setReceiveMessage(receiveMessage);
        return receiveMessage;
    }

    private void setReceiveMessage(boolean receiveMessage) {
        receiveMessage = true;
        historicMessage(receiveMessage);
        this.receiveMessage = receiveMessage;
    }

    protected void historicMessage(boolean historicMessage) {
        historicMessage = isConnection() || (isSendMessage() || isReceiveMessage());

        if (historicMessage)
            System.out.println("Histórico sincronizado");
    }

    public abstract void sendMessage();

    public abstract void receiveMessage();

}