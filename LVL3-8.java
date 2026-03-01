import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, and Time: ");
        double p = input.nextDouble(), r = input.nextDouble(), t = input.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + " and Time " + t);
    }
}