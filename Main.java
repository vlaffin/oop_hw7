
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplexCalculator calculator = new ComplexCalculator();

        System.out.print("* Input real part of A: ");
        double realA = scanner.nextDouble();
        System.out.print("* Input imaginary part of A: ");
        double imaginaryA = scanner.nextDouble();
        ComplexNumber a = new ComplexNumber(realA, imaginaryA);

        System.out.print("* Input real part of B: ");
        double realB = scanner.nextDouble();
        System.out.print("* Input imaginary part of B: ");
        double imaginaryB = scanner.nextDouble();
        ComplexNumber b = new ComplexNumber(realB, imaginaryB);

        System.out.println("* Choose operation: ");
        System.out.println("* 1. Summa");
        System.out.println("* 2. Multiply");
        System.out.println("* 3. Divide");
        int choice = scanner.nextByte();

        ComplexNumber result = null;
        switch (choice) {
            case 1 -> result = calculator.summa(a, b);
            case 2 -> result = calculator.multiply(a, b);
            case 3 -> result = calculator.divide(a, b);
            default -> System.out.println("Incorrect operation choice. ");
        }
        if (result != null){
            System.out.println("* Answer is: " + result);
        }
    }
}