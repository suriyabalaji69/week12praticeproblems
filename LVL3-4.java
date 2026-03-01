import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("Enter From, Via, and To cities: ");
        String fromCity = input.next(), viaCity = input.next(), toCity = input.next();
        System.out.print("Enter distances (From-Via, Via-To) in miles: ");
        double d1 = input.nextDouble(), d2 = input.nextDouble();
        System.out.print("Enter time taken (From-Via, Via-To) in minutes: ");
        int t1 = input.nextInt(), t2 = input.nextInt();
        
        double totalDistKm = (d1 + d2) * 1.6;
        int totalTime = t1 + t2;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistKm + " km and the Total Time taken is " + totalTime + " minutes");
    }
}