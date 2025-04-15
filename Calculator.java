public class Calculator {

        int add(int a, int b) {
        return a + b;
    }

        int subtract(int a, int b) {
        return a - b;
    }

       int multiply(int a, int b) {
        return a * b;
    }
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0.0;
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 20;
        int b = 4;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
