package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class DienTichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a= ");
        int a = sc.nextInt();
        System.out.print("Nhập b= ");
        int b = sc.nextInt();
        int s = a * b;
        System.out.println("Diện tích HCN là: " + s);
    }
}
