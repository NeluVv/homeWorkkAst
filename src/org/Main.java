package org;

import org.strategy.*;
import org.chain.*;
import org.builder.*;
import org.proxy.*;
import org.decorator.*;
import org.adapter.*;

public class Main {
    public static void main(String[] args) {
        // Strategy
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());
        context.pay(1000);
        context.setStrategy(new PayPalPayment());
        context.pay(2000);

        // Chain
        Handler manager = new Manager();
        Handler director = new Director();
        manager.setNext(director);
        manager.handle("director");

        // Builder
        Computer comp = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println(comp);

        // Proxy
        Image image = new ProxyImage("photo.png");
        image.display();
        image.display();

        // Decorator
        Notifier notifier = new SMSNotifier(new EmailNotifier(new BaseNotifier()));
        notifier.send("Система работает!");

        // Adapter
        NewPrinter printer = new PrinterAdapter(new OldPrinter());
        printer.print("Тестовый текст");
    }
}
