package com.springboot.store;
// constructor injection
public class OrderPayment {
    private final Payment payment;

    public OrderPayment(Payment payment) {
        this.payment = payment;
    }
    public void getPayment() {
        payment.processPayment(10);
    }
}
