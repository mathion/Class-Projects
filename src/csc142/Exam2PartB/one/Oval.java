package csc142.Exam2PartB.one;


import javax.swing.*;

public class Oval extends Shape {
    private int diameterX;
    private int diameterY;

    public Oval(int diameterX, int diameterY) {
        this.diameterX = diameterX;
        this.diameterY = diameterY;
        this.area = calcArea(diameterX, diameterY);
        this.perimeter = calcPerimeter(diameterX, diameterY);
    }


    public static double calcPerimeter(double diameterX, double diameterY) {
        double temp = Math.PI;
        temp *= (3 * (diameterX / 2.0 + diameterY / 2.0) - Math.sqrt((3 * diameterX / 2.0 + diameterY / 2.0) * (diameterX / 2.0 + 2 * diameterY / 2.0)));
        return temp;
    }

    public static double calcArea(double radiusX, double radiusY) {
        return Math.PI * radiusX / 2.0 * radiusY / 2.0;
    }

    //reCalc used to change the area and perimeter whenever the diameter changes
    private void reCalc() {
        this.area = calcArea(diameterX, diameterY);
        this.perimeter = calcPerimeter(diameterX, diameterY);
    }

    public int getDiameterX() {
        return diameterX;
    }

    public void setDiameterX(int diameterX) {
        this.diameterX = diameterX;
        reCalc();
    }

    public int getDiameterY() {
        return diameterY;
    }

    public void setDiameterY(int diameterY) {
        this.diameterY = diameterY;
        reCalc();
    }

    public String getInfo() {

        String tempString = "Diameter X = " + getDiameterX() + "\n";
        tempString += "Diameter Y = " + getDiameterY() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }

    public int getXOffset() {
        return diameterX;
    }

    public void drawFilled(JFrame window) {
        //drawn at 10,50 to give space from edges
        window.getGraphics().fillOval(10, 50, getDiameterX(), getDiameterY());

    }

    public void drawUnFilled(JFrame window) {
        //drawn at 10,50 to give space from edges
        window.getGraphics().drawOval(10, 50, getDiameterX(), getDiameterY());

    }

}
