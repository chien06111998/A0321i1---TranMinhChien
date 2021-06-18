package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Tính chỉ số cân nặng-----");
        System.out.print("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.print("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi <= 25) {
            System.out.println("Nomal");
        } else if (25 <= bmi && bmi <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
