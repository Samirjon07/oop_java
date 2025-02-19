//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b=6 + a++;
        System.out.println("b is " + (b));
        System.out.println("a is " + (a++));

        Shift(args);
    }

    public static void Shift(String[] args) {
            int a = 10;
            int b = 6;

            System.out.println("b is " + (b>>2));
            System.out.println("a is " + (a<<5));
        }
}


