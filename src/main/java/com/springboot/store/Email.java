package com.springboot.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service("email")
@Primary
public class Email implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
