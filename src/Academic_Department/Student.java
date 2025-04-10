package Academic_Department;

public class Student {
    static int summation(int num1, int num2)
    {
        int sum;
        sum=num1+num2;
        return sum;
    }

    float calc(int sum)
    {
        sum=summation(40,50);
        return sum/5;
    }
    public static void main(String[] args) {

        System.out.println("Summation is:"+summation(5,6));
    }
}
