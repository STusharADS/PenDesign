package com.sst.pendesign;

public class Pen {
    private static final int MAX_INK = 100;

    private final PenType penType;
    private final WritingMechanism mechanism;

    private String color;
    private int inkLevel;

    public Pen(PenType penType, WritingMechanism mechanism, String color) {
        if (penType == null || mechanism == null || color == null || color.isBlank()) {
            throw new IllegalArgumentException("Pen type, mechanism, and color are required.");
        }

        this.penType = penType;
        this.mechanism = mechanism;
        this.color = color;
        this.inkLevel = MAX_INK;
    }

    public void start() {
        mechanism.start();
    }

    public void close() {
        mechanism.close();
    }

    public String write(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text cannot be empty.");
        }

        if (!mechanism.isReady()) {
            throw new IllegalStateException("Call start() before write(). Current mechanism status: " + mechanism.status());
        }

        if (inkLevel <= 0) {
            throw new IllegalStateException("Out of ink. Refill required.");
        }

        int needed = penType.inkConsumption(text);
        if (needed > inkLevel) {
            throw new IllegalStateException("Not enough ink to write this text. Current ink: " + inkLevel + "%");
        }

        inkLevel -= needed;
        return penType.writeStyle(text, color);
    }

    public String refill(String newColor) {
        if (newColor == null || newColor.isBlank()) {
            throw new IllegalArgumentException("Color cannot be empty.");
        }

        this.color = newColor;
        this.inkLevel = MAX_INK;
        return penType.refillStyle(newColor) + " Ink level is now 100%.";
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public String getColor() {
        return color;
    }

    public String getPenTypeName() {
        return penType.name();
    }

    public String getMechanismStatus() {
        return mechanism.status();
    }
}
