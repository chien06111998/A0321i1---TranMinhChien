package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Tính số ngày trong tháng----------");
        System.out.print("Nhập tháng cần tìm: ");
        int a;
        a = sc.nextInt();
        do {
            System.out.print("Nhập sai tháng, yêu cầu nhập lại: ");
            a = sc.nextInt();
        } while (a < 1 || a > 12);
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("Tháng " + a + " có 31 ngày.");
                break;
            case 2:
                System.out.println("Tháng " + a + " có 28 hoặc 29 ngày.");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + a + " có 30 ngày.");
                break;
        }
    }
}
