package com.example.springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springioc.MessageService;


public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      MessageService msgSrv = context.getBean("setterMessageService", MessageService.class);
       msgSrv.printMessage();
     
    }
}
