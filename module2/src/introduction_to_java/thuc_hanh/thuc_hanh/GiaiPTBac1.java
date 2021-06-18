package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Giải PT bậc 1--------");
        System.out.print("Nhập a = ");
        int a = sc.nextInt();
        System.out.print("Nhập b = ");
        int b = sc.nextInt();
        System.out.print("PT bậc nhất: " + a +"x + " + b + " có nghiệm là: -b/a = " + (-b/a));
    }
}
