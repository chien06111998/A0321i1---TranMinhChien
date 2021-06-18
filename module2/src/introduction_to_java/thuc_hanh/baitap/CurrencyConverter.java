package introduction_to_java.thuc_hanh.baitap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------currency converter------");
        System.out.print("Enter united states dollar: ");
        double rate = sc.nextDouble();
        double vnd = rate * 23000;
        System.out.println("$" + rate + " converted to " + vnd +"vnd");
    }
}
