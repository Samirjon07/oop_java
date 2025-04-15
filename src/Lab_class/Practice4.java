package Lab_class;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
    salarycalculation();
    }
    static void salarycalculation(){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Enter your salary: ");
    double salary = input.nextDouble();

    System.out.print("Enter extra hours: ");
    int extraHours = input.nextInt();

    double totalSalary = salary + (extraHours * 20);

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + totalSalary);

    System.out.printf("Mr: %s with Age: %d : The Salary: %.2f%n", name, age, totalSalary);
    }
}
