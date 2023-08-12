package Capter5;
import java.util.Scanner;
public class Watercheak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            if (temperature >= 0 && temperature < 100) {
                System.out.println("Water is in a liquid state at " + temperature + "°C.");
            } else if (temperature < 0) {
                System.out.println("Water is in a solid state (ice) at " + temperature + "°C.");
            } else {
                System.out.println("Water is in a gaseous state (steam) at " + temperature + "°C.");
            }
        } else if (unit == 'F' || unit == 'f') {
            double celsiusTemperature = (temperature - 32) * 5 / 9;
            if (celsiusTemperature >= 0 && celsiusTemperature < 100) {
                System.out.println("Water is in a liquid state at " + temperature + "°F.");
            } else if (celsiusTemperature < 0) {
                System.out.println("Water is in a solid state (ice) at " + temperature + "°F.");
            } else {
                System.out.println("Water is in a gaseous state (steam) at " + temperature + "°F.");
            }
        } else {
            System.out.println("Invalid unit entered. Please enter C or F.");
        }


    }
}
