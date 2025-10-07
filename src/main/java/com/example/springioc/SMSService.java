package com.example.springioc;

public class SMSService implements MessageService {
    private String message;

    public SMSService() {
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
        System.out.println("Sending SMS: " + message);
    }
    
}
