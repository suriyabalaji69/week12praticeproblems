import java.util.Scanner;

public class LVL3_10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = reader.nextDouble();

        System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = reader.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        reader.close();
    }
}