package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần đếm:");
        String chars = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chars.charAt(0)) {
                count++;
            }
        }
        System.out.println("Số lượng kí tự " + chars + " trong chuỗi là: " + count);
    }
}
