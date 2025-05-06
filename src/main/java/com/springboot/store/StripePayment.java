package com.springboot.store;

public class StripePayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment with amount " + amount);
    }
}
