package array_and_methods.thuc_hanh.bai_tap;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----find the smallest value-----");
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + (i+1) +"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        show(arr);
        System.out.println("\nThe smallest value is: ");
        System.out.println(findMin(arr));
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static int findMin(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
