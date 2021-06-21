package loop_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----display types----");
        System.out.println("---------Menu--------");
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the square triangle.");
        System.out.println("3. Print isosceles triangle.");
        System.out.println("0. Exit.");
        System.out.println("---------------------");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    Draw_the_rectangle(n, m);
                    break;
                case 2:
                    Draw_the_square_triangle(n);
                    break;
                case 3:
                    Draw_the_isosceles_triangle(n);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice.");
                    break;
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    static void Draw_the_rectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<m ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Draw_the_square_triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Draw_the_isosceles_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
