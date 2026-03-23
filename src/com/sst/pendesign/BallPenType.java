package com.sst.pendesign;

public class BallPenType implements PenType {
    @Override
    public String name() {
        return "Ball Pen";
    }

    @Override
    public String writeStyle(String text, String color) {
        return "[Ball Stroke - " + color + "] " + text.toUpperCase();
    }

    @Override
    public int inkConsumption(String text) {
        return Math.max(1, text.length() / 3);
    }

    @Override
    public String refillStyle(String color) {
        return "Ball pen cartridge replaced with " + color + " ink.";
    }
}
