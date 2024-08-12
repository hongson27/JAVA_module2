package ss1_introduction_to_java.bai_tap;


import java.util.Scanner;
public class Reading_number {
    public static void main(String[] args) {
        String[] ones = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] tens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] combine = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số từ 1 đến 999:");
        int number = sc.nextInt();
        if (number < 11) {
            System.out.println(ones[number]);
        } else if (number < 20) {
            System.out.println(tens[number - 10]);
        } else if (number < 100) {
            System.out.println(combine[number/10] +" "+ ones[number % 10]);
        } else if (number < 1000){
            if ((number - (number/100)*100) <20 ){
                System.out.println(ones[number/100] + " Hundred and " + tens[(number % 100)%10]);
            } else {
                System.out.println(ones[number/100] + " Hundred and " + combine[(number % 100)/10] + " " + ones[number%10]);
            }
        } else {
            System.out.println("So ko hop le");
        }
    }
}


