# Pen Design

LLD assignment for designing a pen system.

## What is included

- Class diagram: `docs/pen-uml.md`
- Java code: `src/com/sst/pendesign/*.java`
- Demo: `Demo.java`

## Features

- `start()`
- `write(String text)`
- `close()`
- `refill(String color)`

Rules handled:
- `start()` must be called before `write()`
- Different write/refill behavior for Ink, Ball, Gel
- Refill always sets ink to 100%
- Color can change while refilling

## Run

1. Compile

```bash
javac -d out src/com/sst/pendesign/*.java
```

2. Run

```bash
java -cp out com.sst.pendesign.Demo
```
