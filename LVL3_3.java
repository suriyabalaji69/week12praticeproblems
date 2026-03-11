import java.util.Scanner;

public class LVL3_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your marks for the three subjects:");
        
        System.out.print("Physics: ");
        int physics = reader.nextInt();

        System.out.print("Chemistry: ");
        int chemistry = reader.nextInt();

        System.out.print("Maths: ");
        int maths = reader.nextInt();

        int average = (physics + chemistry + maths) / 3;

        System.out.println("\n--- Your Result ---");
        System.out.println("Your Average is: " + average + "%");

        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remark: Level 4, above standards");
        } 
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remark: Level 3, at standards");
        } 
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remark: Level 2, below standards");
        } 
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remark: Level 1, well below standards");
        } 
        else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remark: Level 1-, too below standards");
        } 
        else {
            System.out.println("Grade: R");
            System.out.println("Remark: Remedial standards");
        }

        reader.close();
    }
}