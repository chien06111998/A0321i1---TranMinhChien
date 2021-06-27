package array_and_methods.thuc_hanh.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FindValuesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Find values in an array-----");
        System.out.print("Enter a length: ");
        int n = Integer.parseInt(sc.nextLine());
        String [] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] : ");
            arr[i] = sc.nextLine();
        }
        search(arr);
    }
    static void search(String [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String str = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                System.out.println("there is " + str + " in the array, at the i = " + i);
            }
        }
    }
}
