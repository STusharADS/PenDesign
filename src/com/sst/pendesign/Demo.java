package com.sst.pendesign;

public class Demo {
    public static void main(String[] args) {
        Pen inkCapPen = new Pen(new InkPenType(), new CapMechanism(), "Blue");
        Pen ballClickPen = new Pen(new BallPenType(), new ClickMechanism(), "Black");
        Pen gelClickPen = new Pen(new GelPenType(), new ClickMechanism(), "Green");

        runScenario("Ink + Cap", inkCapPen);
        runScenario("Ball + Click", ballClickPen);
        runScenario("Gel + Click", gelClickPen);
    }

    private static void runScenario(String title, Pen pen) {
        System.out.println("\n==== " + title + " ====");
        System.out.println("Type: " + pen.getPenTypeName());
        System.out.println("Mechanism: " + pen.getMechanismStatus());

        try {
            System.out.println("Trying to write without start()...");
            System.out.println(pen.write("Hello myself, Tushar"));
        } catch (Exception ex) {
            System.out.println("Expected error: " + ex.getMessage());
        }

        pen.start();
        System.out.println("After start(): " + pen.getMechanismStatus());
        System.out.println("Write output: " + pen.write("Low level design is tough"));
        System.out.println("Ink left: " + pen.getInkLevel() + "%");
        //color stuff
        System.out.println("Refill output: " + pen.refill("Red"));
        System.out.println("Current color: " + pen.getColor());
        System.out.println("Ink left after refill: " + pen.getInkLevel() + "%");

        pen.close();
        System.out.println("After close(): " + pen.getMechanismStatus());
    }
}
