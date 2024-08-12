package ss6_inheritance.thuc_hanh;

import ss7_Abstract_and_Interfaces.bai_tap.Colorable.IColorable;
import ss7_Abstract_and_Interfaces.bai_tap.Resizeable.IResize;

public class Square extends Retangle implements IColorable, IResize {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "To color a square, you can paint all four sides.";
    }

    @Override
    public void resize(double percent) {
        side  = side * percent/100;
    }
}