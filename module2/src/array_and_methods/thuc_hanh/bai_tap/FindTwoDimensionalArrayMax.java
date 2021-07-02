package array_and_methods.thuc_hanh.bai_tap;

import java.util.Scanner;

public class FindTwoDimensionalArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------find two-dimensional array max------");
        System.out.print("Enter array length : ");
        int x = sc.nextInt();
        System.out.print("Enter array height : ");
        int y = sc.nextInt();
        int [][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("arr["+(i+1)+"]["+(j+1)+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Array is: ");
        show(arr, x, y);
        System.out.print("\nThe greatest value is: ");
        System.out.print(findMax(arr, x, y));
    }
    public static void show(int [][] arr, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " " );
            }
        }
    }
    public static int findMax(int [][] arr, int x, int y) {
        int max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
