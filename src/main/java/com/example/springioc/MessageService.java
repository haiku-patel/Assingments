package com.example.springioc;

public class MessageService {
    private String message;
    public MessageService(String message) {
        this.message = message;
    }
    public MessageService(){}
    
    public void printMessage() {
        System.out.println("Message: " + message);
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
