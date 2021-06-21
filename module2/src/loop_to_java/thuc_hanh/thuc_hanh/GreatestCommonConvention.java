package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonConvention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----greatest common convention----");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor.");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }
        System.out.println("The greatest common wish is: " + a);
    }
}
