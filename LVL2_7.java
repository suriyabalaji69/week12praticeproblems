import java.util.Scanner;

public class LVL2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to find factors: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Not a positive integer.");
        }
    }
}