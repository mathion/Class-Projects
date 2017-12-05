package csc142.Exam2PartB.one;

import javax.swing.*;

//the same as Oval but with different names for variables and different method used to calc area and perimeter

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }

    private void reCalc(){
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        reCalc();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        reCalc();
    }

    public int getXOffset(){
        return width;
    }

    public String getInfo() {

        String tempString = "Width = " + getWidth() + "\n";
        tempString += "Height = " + getHeight() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }

    public void drawFilled(JFrame window){
        window.getGraphics().fillRect(10, 50, width, height);

    }

    public void drawUnFilled(JFrame window){
        window.getGraphics().drawRect(10, 50, width, height);

    }
}
