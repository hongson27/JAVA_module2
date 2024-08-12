package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class arr_2_dimensional_cross_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng con thứ " + (i + 1) + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = sum(arr);
        System.out.println("Tổng các phần tử đường chéo 1 là: " + sum);
        int sum2 = sum2(arr);
        System.out.println("Tông các phần tử đường chéo 2 là: " + sum2);
    }
    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
                sum+= arr[i][i];
        }
        return sum;
    }
    public static int sum2(int[][] arr) {
        int sum = 0;
        int temp = arr.length-1;
        for (int[] ints : arr) {
            sum += ints[temp];
            temp--;
        }
        return sum;
    }
}
