package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Linear_equation_resolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Phương trình có dạng ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = sc.nextDouble();
        System.out.println("Nhập b:");
        double b = sc.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm là: " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
