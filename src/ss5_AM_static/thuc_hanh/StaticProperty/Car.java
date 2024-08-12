package ss5_AM_static.thuc_hanh.StaticProperty;

public class Car {
    private String color;
    private double speed;
    public static int numOfCar;
    public Car(String color, double speed) {
        this.color = color;
        this.speed = speed;
        numOfCar ++;
    }
}
