import java.util.Scanner;

public class Temperatureconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Get user's choice
        int choice = scanner.nextInt();

        // Variable to hold the temperature value
        double temperature;

        switch (choice) {
            case 1:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
                break;

            case 2:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
        // Close the scanner
        scanner.close();
    }
}

