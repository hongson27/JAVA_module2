package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class array_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Mang ban vua nhap la: " + Arrays.toString(array));
        System.out.println("Nhap phan tu can xoa:");
        int x = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        for ( int j = 0; j < n; j++ ) {
            if (array[j] != x){
                arr[k] = array[j];
                k++;
            }
        }
        System.out.println("Mang sau khi xoa la: " + Arrays.toString(arr));
    }
}
