package com.sst.pendesign;

public class ClickMechanism implements WritingMechanism {
    private boolean tipOut;

    @Override
    public void start() {
        tipOut = true;
    }

    @Override
    public void close() {
        tipOut = false;
    }

    @Override
    public boolean isReady() {
        return tipOut;
    }

    @Override
    public String status() {
        return tipOut ? "Tip out (ready to write)" : "Tip retracted";
    }
}
