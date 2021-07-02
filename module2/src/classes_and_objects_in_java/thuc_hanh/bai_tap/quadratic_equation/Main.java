package classes_and_objects_in_java.thuc_hanh.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if (a == 0) {
            System.out.print("Tested equation -c/b = " + (-c/b));
        }
        else {
            if (qe.getDiscriminant() < 0) {
                System.out.print("The equation has no roots");
            }
            else if (qe.getDiscriminant() == 0) {
                System.out.print("Dual-tested equations: x1 = x2 = " + (-b / (2 * a)));
            }
            else {
                System.out.print("Equation with two tests: x1 = " + ((-b + Math.sqrt(qe.getDiscriminant()))/(2 * a)) + ", and: x2 = " +((-b - Math.sqrt(qe.getDiscriminant()))/(2 * a)));
            }
        }
    }
}
