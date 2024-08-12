package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiền USD của bạn:");
        double usd = Double.parseDouble(sc.nextLine());
        double vnd = usd * 25000;
        System.out.println("Bạn nhận được: " + vnd + " VND");
    }
}
