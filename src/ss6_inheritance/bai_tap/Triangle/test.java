package ss6_inheritance.bai_tap.Triangle;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh thu 1:");
        double side1 = sc.nextDouble();
        System.out.println("Nhap do dai canh thu 2:");
        double side2 = sc.nextDouble();
        System.out.println("Nhap do dai canh thu 3:");
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Tam giac ban vua nhap la: " + triangle);
    }
}
