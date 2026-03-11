import java.util.Scanner;

public class LVL1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        
        System.out.print("Enter a number (0 to see total): ");
        double input = sc.nextDouble();

        while (input != 0) {
            total += input;
            System.out.print("Enter next number (0 to see total): ");
            input = sc.nextDouble();
        }
        System.out.println("The total sum is: " + total);
    }
}