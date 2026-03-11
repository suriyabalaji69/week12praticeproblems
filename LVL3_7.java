import java.util.Scanner;

public class LVL3_7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = reader.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = reader.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("\nYour BMI is: " + bmi);
        
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } 
        else {
            System.out.println("Status: Obese");
        }
        reader.close();
    }
}