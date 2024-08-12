package ss3_array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là:" + Arrays.toString(array));
        int first = 0;
        int last = array.length;
        int temp;
        while (first < last) {
            temp = array[first];
            array[first] = array[last - 1];
            array[last - 1] = temp;
            first++;
            last--;
        }
        System.out.println("Mảng đảo là:" + Arrays.toString(array));
    }
}
