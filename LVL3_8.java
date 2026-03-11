import java.util.Scanner;

public class LVL3_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        
        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            sum = sum + (originalNumber % 10);
            originalNumber = originalNumber / 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        reader.close();
    }
}