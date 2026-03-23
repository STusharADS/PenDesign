package com.sst.pendesign;

public class CapMechanism implements WritingMechanism {
    private boolean capOpen;

    @Override
    public void start() {
        capOpen = true;
    }

    @Override
    public void close() {
        capOpen = false;
    }

    @Override
    public boolean isReady() {
        return capOpen;
    }

    @Override
    public String status() {
        return capOpen ? "Cap removed (ready to write)" : "Cap closed";
    }
}
