package Task2_SimpleCalculator;

public class Main {
    public static void main(String[] args) {
        // Values
        int sum = Add.add(1, 2);
        int product = Multiplication.multiply(4, 4);
        int squared = Square.square(2);
        int difference = Subtract.subtract(10, 5);

        // Printouts
        System.out.println("Addition: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Squared: " + squared);
        System.out.println("Difference: " + difference);
    }
}