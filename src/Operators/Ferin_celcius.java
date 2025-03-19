package Operators;

import java.util.Scanner ;


public class Ferin_celcius
{
    public static void main(String[] args)
    {
        Scanner Object= new Scanner(System.in);

        final int Base = 32;
        final double Conversion_Factor =9.0/5.0;

        double fahr;

        System.out.print("\nEnter Celsius Value: ");
        int celsius = Object.nextInt();

        fahr = celsius * Conversion_Factor + Base ;

        System.out.println("\nCelsius Temperature: " + celsius + "\t Fahrenheit Temperature: " + fahr);


    }
}
/* CHATGPT WRITTEN:

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        System.out.print("\nEnter Celsius Value: ");
        double celsius = scanner.nextDouble(); // Allows decimal values

        double fahrenheit = celsius * CONVERSION_FACTOR + BASE;

        System.out.printf("\nCelsius Temperature: %.2f°C\t Fahrenheit Temperature: %.2f°F\n", celsius, fahrenheit);

        scanner.close(); // Close scanner to prevent resource leak
    }
}

 */