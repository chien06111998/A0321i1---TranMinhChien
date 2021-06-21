package array_and_methods.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] arr;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Initial array value: ");
        show_array(arr);
        System.out.println("\nArray after inverting is: ");
        array_reversal(arr);
        show_array(arr);
    }
    static void show_array(int arr[]) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void array_reversal(int arr []) {
        int temp = 0;
        int left = 0, right = arr.length-1;
        while (left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}
