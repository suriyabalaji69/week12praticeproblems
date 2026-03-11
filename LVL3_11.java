import java.util.Scanner;

public class LVL3_11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = reader.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = reader.nextInt();

        System.out.print("Enter year: ");
        int y = reader.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;


        System.out.println("The day of the week is: " + d0);
        
        if (d0 == 0) System.out.println("It is a Sunday.");
        else if (d0 == 1) System.out.println("It is a Monday.");
        else if (d0 == 2) System.out.println("It is a Tuesday.");
        else if (d0 == 3) System.out.println("It is a Wednesday.");
        else if (d0 == 4) System.out.println("It is a Thursday.");
        else if (d0 == 5) System.out.println("It is a Friday.");
        else if (d0 == 6) System.out.println("It     is a Saturday.");

        reader.close();
    }
}