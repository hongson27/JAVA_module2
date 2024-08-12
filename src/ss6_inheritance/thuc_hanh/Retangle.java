package ss6_inheritance.thuc_hanh;

public class Retangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;
    public Retangle() {}
    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Retangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "A Retangle with width = "
                + getWidth()
                + " and with height = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
