package org.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " рублей через PayPal.");
    }
}
