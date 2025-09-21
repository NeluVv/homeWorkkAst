package org.chain;

public class Manager extends Handler {
    @Override
    public void handle(String request) {
        if ("manager".equals(request)) {
            System.out.println("Запрос обработан менеджером.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
