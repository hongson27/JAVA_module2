package ss7_Abstract_and_Interfaces.thuc_hanh.Comparator;

import ss6_inheritance.thuc_hanh.Circle;
import java.util.Comparator;

public class ColorCircleComparator extends Circle implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2) {
        return circle1.getColor().compareTo(circle2.getColor());
    }
}
