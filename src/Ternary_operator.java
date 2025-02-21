import java.util.Scanner;

public class Ternary_operator
{
    public static void main(String[] args) {
        Scanner Object =new Scanner(System.in);

        int max;

        System.out.println("Enter First Number: ");
        int num1 = Object.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = Object.nextInt();

            max=(num1>num2) ? num1 : num2 ;
            System.out.printf("\nThe max of (%d and %d) is ---- %d ", num1 ,num2, max);

            max=(num1<num2) ? num1 : num2 ;
            System.out.printf("\nThe min of (%d and %d) is ---- %d \n", num1 ,num2, max);

        System.out.println("\nEnter Third Number: ");
        int num3 = Object.nextInt();

            max=((num1>num2)) ? ((num1>num3) ? num1:num3):((num2>num3) ? num2: num3);
            System.out.printf("\nThe max of (%d and %d and %d) is ---- %d ", num1 ,num2,num3, max);



    }
}
/*CHATGPT WRITTEN

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        // Finding max and min using ternary operator
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;

        System.out.printf("\nMaximum of (%d, %d) is: %d", num1, num2, max);
        System.out.printf("\nMinimum of (%d, %d) is: %d\n", num1, num2, min);

        System.out.print("\nEnter Third Number: ");
        int num3 = scanner.nextInt();

        // Finding the maximum of three numbers using nested ternary operators
        max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.printf("\nMaximum of (%d, %d, %d) is: %d\n", num1, num2, num3, max);

        scanner.close(); // Closing scanner to prevent memory leaks
    }
}

 */