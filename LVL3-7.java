import java.util.Scanner;
public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates and children: ");
        int chocolates = input.nextInt();
        int children = input.nextInt();
        System.out.println("The number of chocolates each child gets is " + (chocolates / children) + " and the remaining chocolates are " + (chocolates % children));
    }
}