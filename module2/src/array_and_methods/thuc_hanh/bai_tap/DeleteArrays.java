package array_and_methods.thuc_hanh.bai_tap;

import java.util.Scanner;

public class DeleteArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Delete arrays-----");
        System.out.print("Enter length : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n-1];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a value to delete");
        int value = sc.nextInt();
        System.out.print("Array is: ");
        show(arr);
        delete_array(value,arr,n);
        show(arr);
    }
    static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void delete_array(int value, int [] arr, int n) {
        System.out.print("Array after deletion is: ");
        int i = 0;
        while (i < n && arr[i] != value)
            i++;
        if (value != arr[i]) {
            System.out.println("no " +value+ " in the array.");
        }
        else {
            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
        }
    }
}
