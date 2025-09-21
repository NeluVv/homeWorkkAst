package org.adapter;

public class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String message) {
        oldPrinter.printText(message);
    }
}
