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
