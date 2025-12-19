class Calculator {
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    // Method to perform calculation
    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                return a + b;
            case "subtract":
            case "subtraction":
                return a - b;
            case "multiply":
            case "multiplication":
                return a * b;
            case "divide":
            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(10.5, 5.5, "add");
        System.out.println("Result: " + calc1.calculate());

        Calculator calc2 = new Calculator(20, 4, "divide");
        System.out.println("Result: " + calc2.calculate());

        Calculator calc3 = new Calculator(7, 3, "multiply");
        System.out.println("Result: " + calc3.calculate());

        Calculator calc4 = new Calculator(15, 8, "subtract");
        System.out.println("Result: " + calc4.calculate());
    }
}