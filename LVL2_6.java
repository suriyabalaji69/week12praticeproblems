import java.util.Scanner;

public class LVL2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Age and Height for 3 friends
        System.out.print("Enter age and height for Amar: ");
        int age1 = sc.nextInt(); double h1 = sc.nextDouble();
        System.out.print("Enter age and height for Akbar: ");
        int age2 = sc.nextInt(); double h2 = sc.nextDouble();
        System.out.print("Enter age and height for Anthony: ");
        int age3 = sc.nextInt(); double h3 = sc.nextDouble();

        // Smallest age
        int minAge = Math.min(age1, Math.min(age2, age3));
        String youngest = (minAge == age1) ? "Amar" : (minAge == age2) ? "Akbar" : "Anthony";
        System.out.println("Youngest friend: " + youngest);

        // Tallest friend
        double maxHeight = Math.max(h1, Math.max(h2, h3));
        String tallest = (maxHeight == h1) ? "Amar" : (maxHeight == h2) ? "Akbar" : "Anthony";
        System.out.println("Tallest friend: " + tallest);
    }
}