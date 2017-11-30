package csc142.Exam2PartB.one;


import javax.swing.*;

public class Oval extends Shapes {
    private int radiusX;
    private int radiusY;

    public Oval(int radiusX, int radiusY) {
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.area = calcArea(radiusX, radiusY);
        this.perimeter = calcPerimeter(radiusX, radiusY);
    }

    public static double calcPerimeter(double radiusX, double radiusY) {
        double temp = Math.PI;
        temp *= (3 * (radiusX + radiusY) - Math.sqrt((3 * radiusX + radiusY) * (radiusX + 2 * radiusY)));
        return temp;
    }

    public static double calcArea(double radiusX, double radiusY) {
        return Math.PI * radiusX * radiusY;
    }

    private void reCalc() {
        this.area = calcArea(radiusX, radiusY);
        this.perimeter = calcPerimeter(radiusX, radiusY);
    }

    public int getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(int radiusX) {
        this.radiusX = radiusX;
        reCalc();
    }

    public int getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(int radiusY) {
        this.radiusY = radiusY;
        reCalc();
    }

    public String getInfo() {

        String tempString = "Radius X = " + getRadiusX() + "\n";
        tempString += "Radius Y = " + getRadiusY() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }

    public int getXOffset() {
        return radiusX;
    }

    public void drawFilled(JFrame window){
        window.getGraphics().fillOval(10, 50, getRadiusX(), getRadiusY());

    }

    public void drawUnFilled(JFrame window){
        window.getGraphics().drawOval(10, 50, getRadiusX(), getRadiusY());

    }

}
