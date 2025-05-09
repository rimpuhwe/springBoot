package com.springboot.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private NotificationService Service;
    public NotificationManager(@Qualifier("sms") NotificationService service) {
        this.Service = service;

    }
    public void send(String message) {
        Service.send(message);
    }
}
