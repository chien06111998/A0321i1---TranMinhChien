package array_and_methods.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("-----temperature conversion-----");
        enter();
    }
    static void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius.");
        System.out.println("2. Celsius to Fahrenheit.");
        System.out.println("0. Exit.");
        System.out.print("Enter a choice : ");
        int choice = sc.nextInt();
        int fah, cel, temperature;
        switch (choice) {
            case 1:
                System.out.print("Enter a fahrenheit : ");
                fah = sc.nextInt();
                temperature = (fah - 32) * 5 / 9;
                System.out.println("Fahrenheit to Celsius : " + temperature);
                break;
            case 2:
                System.out.print("Enter a Celsius : ");
                cel = sc.nextInt();
                temperature = cel * 9 / 5 + 32;
                System.out.println("Celsius to Fahrenheit : " + temperature);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Wrong input");
                break;
        }
        System.out.print("Enter a choice : ");
        choice = sc.nextInt();
    }
}
