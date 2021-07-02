package array_and_methods.thuc_hanh.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAggregation {
    public static void main(String[] args) {
        importArrays();
    }
    public static void importArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Array Aggregation------");
        System.out.print("Enter array length 1: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        System.out.print("Enter array length 2: ");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            System.out.print("arr1["+ (i+1) + "] = ");
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < n2; j++) {
            System.out.print("arr2["+ (j+1) + "] = ");
            arr2[j] = sc.nextInt();
        }
        int [] arr = new int[n1 + n2];
        int pos = 0;
        for (int element : arr1) {
            arr[pos] = element;
            pos++;
        }
        for (int elment : arr2) {
            arr[pos] = elment;
            pos++;
        }
        System.out.println("array after pooling: " + Arrays.toString(arr));
    }
}
