# Assignment 5 | Strategy Pattern

Berdibek Meiirbek, SE-2528  
Option B: Calculator

`Calculator` delegates to `OperationStrategy`. `Main` selects addition, subtraction, and multiplication on the same calculator at runtime. The context has no `if` or `switch` for choosing an operation. `DivideStrategy` is an added extension; the existing Java classes were unchanged.

## Build and run

Use JDK 17 from the project folder:

```text
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main
```

In IntelliJ IDEA, open this folder, select JDK 17, and run `src/Main.java`. No program arguments are required.

```text
Add: 15.0
Subtract: 9.0
Multiply: 36.0
```

## Add a strategy

1. Add a class in `src/strategy` that implements `OperationStrategy.execute(double, double)`.
2. Add its path to `sources.txt` and rebuild.
3. Pass an instance to `setStrategy()` from client code. Keep `Calculator` and existing strategies unchanged.

To try the included division extension without editing `Main`, start:

```text
jshell --class-path out
```

Then enter:

```java
import strategy.*;
Calculator calculator = new Calculator(new AddStrategy());
calculator.setStrategy(new DivideStrategy());
System.out.println(calculator.calculate(12, 3));
/exit
```

The result is `4.0`. Division by zero throws `IllegalArgumentException`. Calculations use standard Java `double` arithmetic.

The Markdown report is [report.md](report.md); PlantUML source and image are in `uml/`.

Reference: [Refactoring.Guru - Strategy](https://refactoring.guru/design-patterns/strategy). OpenAI Codex assisted with code, report preparation, and verification.
