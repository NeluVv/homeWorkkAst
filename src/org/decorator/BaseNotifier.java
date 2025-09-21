package org.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения: " + message);
    }
}
