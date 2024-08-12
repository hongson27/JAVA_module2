package ss7_Abstract_and_Interfaces.bai_tap;

import ss6_inheritance.thuc_hanh.Square;

public class test {
    public static void main(String[] args) {
        Square square = new Square(6);
        System.out.println(square.howToColor());

        System.out.println("Perimeter before: " + square.getPerimeter());
        square.resize(300);
        System.out.println("Perimeter after: " + square.getPerimeter());

    }
}
