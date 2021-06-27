package array_and_methods.thuc_hanh.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Add arrays-----");
        System.out.print("Enter length : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value to add : ");
        int value = sc.nextInt();
        System.out.println("arr1: " +arr1.length);
        int index;
        do {
            System.out.print("Enter index : ");
            index = sc.nextInt();
        } while (index < 1 || index > n+1);
        System.out.println("Array is: ");
        show(arr);
        System.out.print("\nArray after copying \narr1 : ");
        copy_array(arr, arr1);
        show(arr1);
        System.out.println("\nArray after adding is");
        add(arr1, value, index);
        show(arr1);
    }
    static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void copy_array(int [] arr, int [] arr1) {
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
    }
    static void add(int [] arr1, int value, int index) {
        if (index <= 1 && index >= arr1.length - 1) {
            System.out.println("Incorrect insertion location");
        }
        for (int i = arr1.length-1; i >= index; i--) {
            arr1[i] = arr1[i-1];
        }
        arr1[index] = value;
    }
}
