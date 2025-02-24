import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
    Scanner Object = new Scanner(System.in);

    System.out.println("\nEnter Your grade: ");
    int grade = Object.nextInt();

    if (90<=grade && grade<=100){
        System.out.printf("\nYour Grade: %d is equal to --- %d\n",grade,5);

    }

    else if(71<=grade && grade<=89){
        System.out.printf("\nYour Grade: %d is equal to --- %d\n",grade,4);
    }

    else if(60<=grade && grade<=70){
        System.out.printf("\nYour Grade: %d is equal to --- %d\n",grade,3);
    }

    else if(0<=grade && grade<=59){
        System.out.printf("\nYour Grade: %d is equal to --- %d : **** Failed!!! ****\n",grade,2);
    }

    else{
        System.out.println("\nInvalid Value!!!\n");
    }

    main(args);



    }
}
/* CHATGPT WRITTEN:

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Your Grade (0-100): ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.printf("\nYour Grade: %d is equal to --- 5\n", grade);
        }
        else if (grade >= 71) { // No need for "&& grade <= 89" as it's already checked in previous condition
            System.out.printf("\nYour Grade: %d is equal to --- 4\n", grade);
        }
        else if (grade >= 60) {
            System.out.printf("\nYour Grade: %d is equal to --- 3\n", grade);
        }
        else if (grade >= 0) { // No need for "&& grade <= 59" as it's the last valid range
            System.out.printf("\nYour Grade: %d is equal to --- 2 : **** Failed!!! ****\n", grade);
        }
        else {
            System.out.println("\nInvalid Value! Please enter a grade between 0 and 100.\n");
        }

        scanner.close(); // Prevent memory leak
    }
}

 */
