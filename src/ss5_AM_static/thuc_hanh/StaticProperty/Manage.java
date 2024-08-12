package ss5_AM_static.thuc_hanh.StaticProperty;

public class Manage {
    public static void main(String[] args) {
        Car car1 = new Car("blue", 99);
        System.out.println(car1.numOfCar);
        Car car2 = new Car("green",98);
        System.out.println(car2.numOfCar);
    }
}
