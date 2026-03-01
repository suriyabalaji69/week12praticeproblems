import java.util.Scanner;
public class DivisionDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("The Quotient is " + (n1/n2) + " and Reminder is " + (n1%n2) + " of numbers " + n1 + " and " + n2);
    }
}