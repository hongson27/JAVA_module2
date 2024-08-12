package ss3_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class array_add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0 ,0 ,0 ,0 ,7 ,0 ,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm:");
        int value = sc.nextInt();
        System.out.println("Nhap vi tri can them:");
        int index = sc.nextInt();
        int i = arr.length - 1;
        do {
            arr[i] = arr[i-1];
            i--;
        } while (i != index);
        arr[i] = value;
        System.out.println("Mảng sau khi thêm phần tử là: " + Arrays.toString(arr));
    }
}
