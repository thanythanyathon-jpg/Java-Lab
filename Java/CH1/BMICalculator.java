//Name: THanyathon Kitsakun
//ID: 6887101
//Section: 1
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in kilograms: ");
    double weight = scanner.nextDouble();
    double height = scanner.nextDouble();
    
    double BMI = weight / (height* height);
    System.out.printf("%.2f%n", BMI);d
    if (BMI < 18.5 ) {
        System.out.println("Underweight");
    }
    else if (BMI < 24.9 ) {
        System.out.println("Normal weight");
    }
    else if (BMI < 29.9 ) {
        System.out.println("Overweight");
    }
    else {
        System.out.println("Obesity");
    }
    scanner.close();
 }
}
