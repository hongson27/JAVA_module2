package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Operator_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        float length = sc.nextFloat();
        System.out.println("Nhập chiều rộng:");
        float width = sc.nextFloat();
        float area = length * width;
        System.out.println("Diện tích hcn là: " + area);
    }
}
