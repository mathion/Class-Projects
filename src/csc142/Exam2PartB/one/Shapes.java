package csc142.Exam2PartB.one;

import javax.swing.*;

public abstract class Shapes {
    protected double perimeter;
    protected double area;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public abstract String getInfo();

    public abstract int getXOffset();

    public abstract void drawFilled(JFrame window);

    public abstract void drawUnFilled(JFrame window);

}
