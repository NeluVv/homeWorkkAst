package org.chain;

public class Director extends Handler {
    @Override
    public void handle(String request) {
        if ("director".equals(request)) {
            System.out.println("Запрос обработан директором.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
