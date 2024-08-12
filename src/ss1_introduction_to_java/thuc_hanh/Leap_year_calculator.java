package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Leap_year_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra:");
        int year = sc.nextInt();
        boolean check = false;
        boolean Nam_chia_het_cho_4 = year % 4 == 0;
        if (Nam_chia_het_cho_4) {
            boolean Nam_chia_het_cho_100 = year % 100 == 0;
            if (Nam_chia_het_cho_100) {
                boolean Nam_chia_het_cho_400 = year % 400 == 0;
                if (Nam_chia_het_cho_400) {
                    check = true;
                }
            } else {
                check = true;
            }
        }

        if (check) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
