package csc142.Exam2PartB.one;

import javax.swing.*;

//Abstract shape class

public abstract class Shape {
    protected double perimeter;
    protected double area;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public abstract String getInfo();

    //XOffset is used for placing info text next to the shape
    public abstract int getXOffset();

    public abstract void drawFilled(JFrame window);

    public abstract void drawUnFilled(JFrame window);

}
