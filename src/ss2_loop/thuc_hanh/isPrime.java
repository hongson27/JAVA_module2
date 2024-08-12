package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            boolean isPrime = true;
                for (int j = 2; j<= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
            }
                if (isPrime) {
                    System.out.println(number + " là số nguyên tố");
                } else {
                    System.out.println(number + " không phải là số nguyên tố");
                }
            }
        }

}
