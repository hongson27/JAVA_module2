package ss6_inheritance.bai_tap;

public class ManagerPoint {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(3,4);
        Point3D point3d = new Point3D(3,4,5);
        System.out.println(point2d.toString());
        System.out.println(point3d.toString());

        MoveAblePoint moveAblePoint = new MoveAblePoint(2,2,3,3);
        System.out.println(moveAblePoint.toString());
        moveAblePoint.move();
        System.out.println((moveAblePoint.move()).toString());

    }
}
