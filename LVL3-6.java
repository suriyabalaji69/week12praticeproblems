import java.util.Scanner;
public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of the park (meters): ");
        double s1 = input.nextDouble(), s2 = input.nextDouble(), s3 = input.nextDouble();
        double perimeter = s1 + s2 + s3;
        double rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}