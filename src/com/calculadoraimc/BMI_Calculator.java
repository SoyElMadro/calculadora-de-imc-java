import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Ask the user to enter their height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Validate that weight and height are positive values
        if (weight <= 0 || height <= 0) {
            System.out.println("Please enter valid values for weight and height.");
            // Exit the program if the values are not valid
            System.exit(0);
        }

        // Calculate the BMI (Body Mass Index)
        double bmi = weight / (height * height);

        // Display the BMI result with two decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Interpret the BMI result
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Close the Scanner object
        scanner.close();
    }
}
