package array_and_methods.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----find the smallest value----");
        System.out.print("Enter length : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The smallest value is: " + find_min(arr));
    }
    static int find_min(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
