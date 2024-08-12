package ss3_array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Count_student_pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng học sinh:");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("Số lượng học sinh không được vượt quá 10");
            }
        } while (n > 10);
        int[] marks = new int[n];
        int i = 0;
        while (i < marks.length) {
            System.out.println("Nhập điểm học sinh thứ " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sách điểm: ");
        System.out.println(Arrays.toString(marks));
        for (int ele : marks) {
            if (ele >= 5) {
                count++;
            }
        }
        System.out.println("Số lượng học sinh đậu: " + count);
    }
}
