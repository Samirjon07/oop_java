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
