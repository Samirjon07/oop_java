import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args)
    {
        Scanner Object= new Scanner(System.in);//it is necessary fot taking input from a user

        System.out.print("\nEnter Width Value: ");// will ask for width
        int width = Object.nextInt();// user will enter width

        System.out.print("\nEnter Height Value: ");// will ask for height
        int height = Object.nextInt();// user will enter height

        int area = Area(width,height);// it will store value of Area calling this method
        int perim = Perimeter(width,height);// it will store value of Perimeter calling this method


        System.out.println("\n\n************************************************************************\n\n");// to look beautiful
        System.out.printf("The Area of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height, area);// will print area using formatting
        System.out.printf("The Perimeter of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height,perim);// will print perimeter using formatting



        width++;//increment= width+1
        height++;//increment= height+1

        area = Area(width,height);// again call area method with new incremented values
        perim = Perimeter(width,height);// again call perimeter method with new incremented values

        System.out.println("\n\n***************  AFTER INCREMENTING WIDTH AND HEIGHT  *****************");
        System.out.printf("\n\nThe Area of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height, area);
        System.out.printf("The Perimeter of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height,perim);


        width=(width<<1);// << is left shift means multiplication, 1 means 2^1, width*2
        height=(height>>2);// << is right shift means devision, 2 means 2^2, width/4

        area = Area(width,height);// again call area method with new multiplied values
        perim = Perimeter(width,height);// again call perimeter method with new devided values

        System.out.printf("\n\n*******  AFTER MULTIPLYING AND DIVIDING BY USING SHIFT OPERATOR  *******");
        System.out.printf("\n\nThe Area of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height, area);
        System.out.printf("The Perimeter of a rectangle with width %d cm and height %d cm is:\n\t%d cm²\n", width, height,perim);




    }

    public static int Area(int width, int height)// this is a method to calculate Area
    {
        return width * height;
    }

    public static int Perimeter(int width, int height)// this is a method to calculate Perimeter
    {
        return 2* (width + height);
    }


}
