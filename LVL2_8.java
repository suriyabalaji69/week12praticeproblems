import java.util.Scanner;

public class LVL2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to find factors: ");
        int number = sc.nextInt();

        if (number > 0) {
            int i = 1;
            System.out.print("Factors of " + number + " are: ");
            while (i < number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        } else {
            System.out.println("Not a positive integer.");
        }
    }
}