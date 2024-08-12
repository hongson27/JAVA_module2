package ss7_Abstract_and_Interfaces.thuc_hanh.Comparator;

import ss6_inheritance.thuc_hanh.Circle;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle("red", true, 25);
        circles[1] = new Circle("yellow", false, 35);
        circles[2] = new Circle("green", true, 67);

        System.out.println("Pre-sorted array:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, new CircleComparator());

        System.out.println("\nSorted array by radius:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, new ColorCircleComparator());
        
        System.out.println("\nSorted array by color:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
