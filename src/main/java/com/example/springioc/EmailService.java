package com.example.springioc;

public class EmailService implements MessageService  {
     private String message;

    public EmailService() {
        // default constructor for setter injection
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending Email: " + message);
    }
}
