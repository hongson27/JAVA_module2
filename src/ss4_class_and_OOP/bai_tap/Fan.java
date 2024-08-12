package ss4_class_and_OOP.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = true;
    private double radius = 5;
    private String color = "blue";
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius + ", Status: ON";
        } else {
            return "Color: " + this.color + ", Radius: " + this.radius + ", Status: OFF";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println(fan2);
    }
}

