package Methods;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int oper = 4; //orepation

        switch (oper) {
            case 1:
                int add = add(num1, num2);
                System.out.printf("The addition of %d and %d is: %d%n", num1, num2, add);
                break;
            case 2:
                int sub = sub(num1, num2);
                System.out.printf("The subtraction of %d and %d is: %d%n", num1, num2, sub);
                break;
            case 3:
                int mul = mul(num1, num2);
                System.out.printf("The multiplication of %d and %d is: %d%n", num1, num2, mul);
                break;
            case 4:
                float div = div(num1, num2);
                System.out.printf("The division of %d and %d is: %.2f%n", num1, num2, div);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }

    static float div(int num1, int num2) {
        if (num2 != 0) {
            return (float) num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

}
