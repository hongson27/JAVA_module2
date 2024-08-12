package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class Temperature_convert {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Fahrenheit to Celsius");
                System.out.println("Enter Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
                break;
            case 2:
                System.out.println("Celsius to Fahrenheit");
                System.out.println("Enter Celsius: ");
                double celsius1 = sc.nextDouble();
                double fahrenheit1 = (celsius1 * 9 / 5) + 32;
                System.out.println(celsius1 + " Celsius = " + fahrenheit1 + " Fahrenheit");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
