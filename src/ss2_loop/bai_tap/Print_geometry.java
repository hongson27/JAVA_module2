package ss2_loop.bai_tap;

public class Print_geometry {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật:");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 12; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Tam giác vuông:");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Tam giác vuông ngược:");
        for (int i = 5; i > 0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
