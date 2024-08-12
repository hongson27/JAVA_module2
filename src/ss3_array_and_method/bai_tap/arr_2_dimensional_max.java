package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class arr_2_dimensional_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng mẹ:");
        int n = sc.nextInt();
        System.out.println("Nhập độ dài mảng con:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng con thứ " + (i + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max = findMax(arr);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
