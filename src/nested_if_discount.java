//So the question my teacher wrote on the white board is: Input product Name, Quantity, price. Compute the total amount. If total amount is greater than 2000 discount is 5%, if total amount is greater than 5000 discount is 10%, if greater than 10000 discount is 20%


import java.util.Scanner;

public class nested_if_discount {
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);

        float total;
        double aft_dis;
        int discount;

        System.out.println("\nWhat is the name of the product: ");
        String name = Object.nextLine();

        System.out.println("\nHow many do you want to buy: ");
        int quantity = Object.nextInt();

        System.out.println("\nWhat is the price of each product: ");
        float price = Object.nextFloat();

        total = quantity * price;
        aft_dis=total;
        discount=0;


        if (quantity > 1000) {
            discount=3;
            aft_dis = total * 0.97;


            if (quantity > 2000) {
                discount=5;
                aft_dis = total * 0.95;

                if (quantity > 5000) {
                    discount=10;
                    aft_dis = total * 0.90;

                    if (quantity > 10000) {
                        discount=15;
                        aft_dis = total * 0.85;

                    }
                }
            }
        }

        else {

            System.out.println("\nYou bought less than 1000 piece for that reason no discount:");
        }

        System.out.printf("\n (Without discount) The total price of %d pieces of %s - one piece price is %.2f $ - is : %.2f $ \n", quantity, name, price, total);
        System.out.printf("\n (With discount) The total price of %d pieces of %s - one piece price is %.2f $ - with  %d%% discount  is : %.2f $\n", quantity, name, price,discount, aft_dis);
    }
}