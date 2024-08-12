package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class Find_value {
    public static void main(String[] args) {
        String[] arr = {"Sơn", "Thúy", "Huy", "Tài", "Long","Thỏa", "Dương"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm:");
        String name = scanner.nextLine();
        for (String s : arr) {
            if (s.equals(name)) {
                System.out.println(name + " có trong mảng");
            } else {
                System.out.println(name + " không có trong mảng");
            }
            break;
        }
    }
}
