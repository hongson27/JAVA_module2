package CodeGymManagement;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void displayStudentFunctional() {
        int choice;
        do {
            System.out.println("Quẩn lý học viên.");
            System.out.println("1. Hiển thị danh sách học viên.");
            System.out.println("2. Thêm mới học viên.");
            System.out.println("3. Chỉnh sửa thông tin học viên.");
            System.out.println("4. Xóa học viên.");
            System.out.println("5. Trở về trang chủ.");
            System.out.println("Nhập lựa chọn của bạn:");

            choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                case 1:
                    displayStudent();
                    break;
                    case 2:
                        addStudent();
                        break;
                        case 5:
                            return;

                    }
        } while (true);

    }

    public void addStudent() {
        System.out.println("Thêm mới học viên:");
        System.out.print("Nhập ID học viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập code học viên: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh học viên: ");
        String temp = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(temp);
        System.out.print("Nhập email học viên: ");
        String email = scanner.nextLine();
        System.out.print("Nhập lớp học viên: ");
        String classroom = scanner.nextLine();
        Student student = new Student(id, code, name, birthday, email, classroom);
        iStudentService.add(student);
    }

    public void displayStudent() {
        List<Student> students = iStudentService.findAll();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
