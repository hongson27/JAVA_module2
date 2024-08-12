package ss3_array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Find_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
