package com.springboot.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//        SpringApplication.run(StoreApplication.class, args);
        OrderPayment order = new OrderPayment(new StripePayment());
        order.getPayment();
    }

}
