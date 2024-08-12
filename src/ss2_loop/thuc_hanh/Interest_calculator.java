package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Interest_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi:");
        double money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        int month = sc.nextInt();
        System.out.println("Nhập lãi suất:");
        double rate = sc.nextDouble();
        double interest = money * (rate / 100) / 12 * month;
        System.out.println("Số tiền lãi sau " + month + " tháng là: " + interest);
    }
}
