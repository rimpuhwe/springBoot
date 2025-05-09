package com.springboot.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ApplicationContext = SpringApplication.run(StoreApplication.class, args);
        NotificationService service = ApplicationContext.getBean(NotificationService.class);
        service.send("Hello World");
//        OrderPayment order = new OrderPayment(new StripePayment());
//        order.getPayment();
    }

}
