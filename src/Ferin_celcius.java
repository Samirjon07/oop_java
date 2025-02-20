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
