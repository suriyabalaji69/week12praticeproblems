import java.util.Scanner;

public class LVL3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (1582 or later): ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Year! Please enter a year >= 1582.");
        } 
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}