import strategy.AddStrategy;
import strategy.Calculator;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;

public class Main {
    public static void main(String[] args) {
        double left = 12;
        double right = 3;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Add: " + calculator.calculate(left, right));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtract: " + calculator.calculate(left, right));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiply: " + calculator.calculate(left, right));
    }
}
