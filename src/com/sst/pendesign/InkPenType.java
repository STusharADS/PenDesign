package com.sst.pendesign;

public class InkPenType implements PenType {
    @Override
    public String name() {
        return "Ink Pen";
    }

    @Override
    public String writeStyle(String text, String color) {
        return "[Ink Flow - " + color + "] " + text;
    }

    @Override
    public int inkConsumption(String text) {
        return Math.max(1, text.length() / 2);
    }

    @Override
    public String refillStyle(String color) {
        return "Ink reservoir refilled with " + color + " ink.";
    }
}
