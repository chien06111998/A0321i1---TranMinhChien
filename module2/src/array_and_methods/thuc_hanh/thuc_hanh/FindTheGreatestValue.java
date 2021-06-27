package array_and_methods.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class FindTheGreatestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Find Max-----");
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        show(arr);
        System.out.print("/nMax is: ");
        System.out.print(max(arr));
    }
    static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int max(int [] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
