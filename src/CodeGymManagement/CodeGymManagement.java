package CodeGymManagement;

import java.util.Scanner;

public class CodeGymManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        int choice;
        do {
            System.out.println("Quản lý CodeGym:");
            System.out.println("1. Quản lý học viên.");
            System.out.println("2. Quản lý giảng viên.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.displayStudentFunctional();
                    break;
                case 2:
                    System.out.println("Chức năng quản lý giảng viên đang cập nhật...");
                    break;
                case 3:
                    System.exit(1);
            }
        } while (true);
    }
}
