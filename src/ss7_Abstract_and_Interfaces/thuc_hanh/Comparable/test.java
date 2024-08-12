package ss7_Abstract_and_Interfaces.thuc_hanh.Comparable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<ComparableCircle> comparableList = new ArrayList<>();
        comparableList.add(new ComparableCircle("red", true, 30 ));
        comparableList.add(new ComparableCircle("blue", true, 50 ));
        comparableList.add(new ComparableCircle("black", true, 40 ));

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableList) {
            System.out.println(circle);
        }

        Collections.sort(comparableList);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableList) {
            System.out.println(circle);
        }
    }
}
