package SimpleCaseStudy;

import java.util.List;
import java.util.Scanner;

public class Mainn {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
//        int choice = 0;
        do {
            System.out.println(
                    """
                            1. Hiển thị danh sách
                            2. Thêm mới sản phẩm
                            3. Xoá sản phẩm
                            4. Tìm kiếm theo tên
                            5. Cập nhật thông tin sản phẩm
                            6. Thoát""");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("--------------Hiển thị danh sách sản phẩm-------------------");
                    manager.display();
                    break;
                case 2:
                    // thêm mới
                    System.out.println("---------------Thêm mới--------------------");
                    Product product = inputDatStudent();
                    manager.add(product);
                    System.out.println("-- thêm mới thành công---");
                    break;
                case 3:
                    // xoá
                    System.out.println("---------------Xoá--------------------------");
                    System.out.println("Nhâp id cần xoá: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    manager.deleteById(id);
                    break;
                case 4:
                    // tìm kiếm
                    System.out.println("--------------Tim kiem theo ten----------");
                    System.out.println("Nhập tên cần tìm:");
                    String name = scanner.nextLine();
                    manager.findByName(name);
                    break;
                case 5:
                    // cập nhật
                    System.out.println("----Cập nhật sản phẩm ----");
                    System.out.println("Nhập id cần cập nhật:");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá");
                    int newPrice = Integer.parseInt(scanner.nextLine());
                    Product newProduct = new Product(idUpdate,newName,newPrice);
                    manager.updateById(idUpdate,newProduct);
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }


    public static Product inputDatStudent(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,price);
        return  product;
    }
}
