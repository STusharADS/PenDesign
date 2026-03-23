package com.sst.pendesign;

public interface PenType {
    String name();

    String writeStyle(String text, String color);

    int inkConsumption(String text);

    String refillStyle(String color);
}
