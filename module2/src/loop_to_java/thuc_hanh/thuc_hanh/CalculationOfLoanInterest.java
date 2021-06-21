package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class CalculationOfLoanInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----calculation of loan interest----");
        System.out.print("Enter loan money: ");
        double money = sc.nextDouble();
        System.out.print("Enter loan month number: ");
        int month = sc.nextInt();
        System.out.println("Enter interest rate by year: ");
        double interest = sc.nextDouble();
        double interest_amount = money * ((interest/100)/12) * month;
        System.out.println("Total of interset: " + interest_amount);
    }
}
