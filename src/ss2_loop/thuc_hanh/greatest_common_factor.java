package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class greatest_common_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int x = sc.nextInt();
        System.out.println("Nhập số thứ hai:");
        int y = sc.nextInt();
        int UCLN = findGCD(x, y);
        System.out.println("Ước chung lớn nhất của " + x + " và " + y + " là: " + UCLN);
    }
    private static int findGCD(int x, int y) {
        if(y== 0){
            return x;
        }
        return findGCD(y, x%y);
    }
}
