package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BMI_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn:");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao của bạn:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18) {
            System.out.println("BMI của bạn là: " + bmi);
            System.out.println("Bạn thiếu cân");
        } else if (bmi < 25) {
            System.out.println("BMI của bạn là: " + bmi);
            System.out.println("Bạn bình thường");
        } else if (bmi < 30) {
            System.out.println("BMI của bạn là: " + bmi);
            System.out.println("Bạn béo phì");
        } else {
            System.out.println("BMI của bạn là: " + bmi);
            System.out.println("Bạn béo phì nặng");
        }
    }
}
