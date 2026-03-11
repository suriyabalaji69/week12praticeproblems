import java.util.Scanner;

public class LVL1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start value for countdown: ");
        int start = sc.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}