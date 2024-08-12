package ss7_Abstract_and_Interfaces.thuc_hanh.Comparator;

import ss6_inheritance.thuc_hanh.Circle;
import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2) {
        return Double.compare(circle1.getRadius(), circle2.getRadius());
    }
}
