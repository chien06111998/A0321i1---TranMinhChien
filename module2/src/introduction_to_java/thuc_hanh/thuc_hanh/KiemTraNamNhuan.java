package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Kiểm tra năm nhuận-------");
        System.out.printf("Nhập năm: ");
        int nam = sc.nextInt();
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.printf("Năm "+ nam + " là năm nhuận.");
        }
        else {
            System.out.println("Năm " + nam + " không phải năm nhuận");
        }
    }
}
