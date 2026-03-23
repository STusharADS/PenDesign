package com.sst.pendesign;

public interface WritingMechanism {
    void start();

    void close();

    boolean isReady();

    String status();
}
