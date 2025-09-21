package org.proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка " + filename);
    }

    @Override
    public void display() {
        System.out.println("Отображение " + filename);
    }
}
