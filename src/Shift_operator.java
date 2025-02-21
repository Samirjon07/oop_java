import java.util.Scanner;

public class Shift_operator {
        public static void main(String[] args) {
            Scanner Object= new Scanner(System.in);

            System.out.print("\nEnter First Value: ");
            int first = Object.nextInt();

            System.out.print("\nEnter Second Value: ");
            int second = Object.nextInt();

            System.out.println("\n\n***************  MULTIPLYING USING lEFT SHIFT  *****************");
            System.out.printf("\nMultiplying %d by 1 : " + (first<<0)+"\n", first);
            System.out.printf("\nMultiplying %d by 2 : " + (first<<1)+"\n", first);
            System.out.printf("\nMultiplying %d by 4 : " + (first<<2)+"\n", first);
            System.out.printf("\nMultiplying %d by 8 : " + (first<<3)+"\n", first);

            System.out.println("\n\n***************  DEVIDING USING RIGHT SHIFT  *****************");
            System.out.printf("\nDividing %d by 1 : " + (second >> 0) + "\nRemainder: " + (second % 1)+"\n",second);
            System.out.printf("\nDividing %d by 2 : " + (second >> 1) + "\nRemainder: " + (second % 2)+"\n",second);
            System.out.printf("\nDividing %d by 4 : " + (second >> 2) + "\nRemainder: " + (second % 4)+"\n",second);
            System.out.printf("\nDividing %d by 8 : " + (second >> 3) + "\nRemainder: " + (second % 8)+"\n",second);

        }

}
/* CHATGPT WRITTEN:

import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter First Value: ");
        int first = scanner.nextInt();

        System.out.print("\nEnter Second Value: ");
        int second = scanner.nextInt();

        // Multiplication using left shift
        System.out.println("\n***************  MULTIPLYING USING LEFT SHIFT  *****************");
        for (int i = 0; i <= 3; i++) {
            System.out.printf("\nMultiplying %d by %d  : %d", first, (1 << i), first << i);
        }

        // Division using right shift
        System.out.println("\n\n***************  DIVIDING USING RIGHT SHIFT  *****************");
        for (int i = 0; i <= 3; i++) {
            int divisor = 1 << i;
            System.out.printf("\nDividing %d by %d  : %d \t Remainder: %d", second, divisor, second >> i, second % divisor);
        }

        System.out.println(); // New line for better output readability
        scanner.close(); // Close scanner to prevent memory leaks
    }
}

 */