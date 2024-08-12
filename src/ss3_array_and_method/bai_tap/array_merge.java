package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class array_merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang 1:");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array1[i] = sc.nextInt();
        }
        System.out.println("Nhap so luong phan tu cua mang 2:");
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array2[i] = sc.nextInt();
        }
        System.out.println("Mảng 1 là: " + Arrays.toString(array1));
        System.out.println("Mảng 2 là: " + Arrays.toString(array2));
        int[] array3 = new int[n + m];
        for (int i = 0; i < n; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < m; i++) {
            array3[i + n] = array2[i];
        }
        System.out.println("Mảng 3 là: " + Arrays.toString(array3));
    }
}
