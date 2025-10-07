package com.example.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springioc.MessageService;


public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      // Get EmailService bean
       MessageService email = context.getBean("emailService", MessageService.class);
       email.sendMessage();

       // Get SMSService bean
       MessageService sms = context.getBean("smsService", MessageService.class);
       sms.sendMessage();
    }
}
