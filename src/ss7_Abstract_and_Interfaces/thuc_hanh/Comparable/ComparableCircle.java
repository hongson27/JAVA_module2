package ss7_Abstract_and_Interfaces.thuc_hanh.Comparable;

import ss6_inheritance.thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo(ComparableCircle otherCircle) {
        return Double.compare(this.getRadius(), otherCircle.getRadius());
    }
}
