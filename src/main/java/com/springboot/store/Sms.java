package com.springboot.store;

import org.springframework.stereotype.Service;

import java.awt.*;
@Service("sms")
public class Sms implements NotificationService {
    public void send( String message) {
        Toolkit.getDefaultToolkit().beep();
        System.out.println(message);

    }
}
