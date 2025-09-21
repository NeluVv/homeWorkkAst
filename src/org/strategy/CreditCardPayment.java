package org.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата " + amount + " рублей картой.");
    }
}
