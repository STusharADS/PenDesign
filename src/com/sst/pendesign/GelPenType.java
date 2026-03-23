package com.sst.pendesign;

public class GelPenType implements PenType {
    @Override
    public String name() {
        return "Gel Pen";
    }

    @Override
    public String writeStyle(String text, String color) {
        return "[Gel Smooth - " + color + "] ~" + text + "~";
    }

    @Override
    public int inkConsumption(String text) {
        return Math.max(1, text.length() / 2 + 1);
    }

    @Override
    public String refillStyle(String color) {
        return "Gel refill tube loaded with " + color + " ink.";
    }
}
