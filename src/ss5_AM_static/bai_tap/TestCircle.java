package ss5_AM_static.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "blue");
        Circle circle2 = new Circle(10, "red");
        System.out.println("Diện tích hình tròn 1: " + circle1.getArea());
        System.out.println("Màu sắc hình tròn 1: " + circle1.getColor());
        System.out.println("Diện tích hình tròn 2: " + circle2.getArea());
    }
}
