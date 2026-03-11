import java.util.Scanner;

public class LVL3_6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = reader.nextInt();
        
        int count = 0; 
        while (number != 0) {
            number = number / 10; 
            count++; 
        }
        System.out.println("Number of digits: " + count);
        reader.close();
    }
}