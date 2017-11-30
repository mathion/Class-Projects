package csc142.Exam2PartB.one;

import javax.swing.*;

public class LShape extends Shapes {
    private int longWidth;
    private int longHeight;
    private int shortWidth;
    private int shortHeight;


    public LShape(int longWidth, int longHeight, int shortWidth, int shortHeight) {
        this.longWidth = longWidth;
        this.longHeight = longHeight;
        this.shortWidth = shortWidth;
        this.shortHeight = shortHeight;
        calcAreaAndPerimeter();
    }

    private void calcAreaAndPerimeter() {
        this.perimeter = 2 * (longHeight + longWidth);
        this.area = (shortWidth * longHeight) + (shortHeight * (longWidth - shortWidth));
    }

    public int getLongWidth() {
        return longWidth;
    }

    public void setLongWidth(int longWidth) {
        this.longWidth = longWidth;
        calcAreaAndPerimeter();
    }

    public int getLongHeight() {
        return longHeight;
    }

    public void setLongHeight(int longHeight) {
        this.longHeight = longHeight;
        calcAreaAndPerimeter();
    }

    public int getShortWidth() {
        return shortWidth;
    }

    public void setShortWidth(int shortWidth) {
        this.shortWidth = shortWidth;
        calcAreaAndPerimeter();
    }

    public int getShortHeight() {
        return shortHeight;
    }

    public void setShortHeight(int shortHeight) {
        this.shortHeight = shortHeight;
        calcAreaAndPerimeter();
    }

    public int getXOffset(){
        return longWidth;
    }

    public String getInfo() {

        String tempString = "Long Width = " + getLongWidth() + "\n";
        tempString += "Long Height = " + getLongHeight() + "\n";
        tempString += "Short Width = " + getShortWidth() + "\n";
        tempString += "Short Height = " + getShortHeight() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }

    public void drawFilled(JFrame window){
        window.getGraphics().fillRect(10, 50, getShortWidth(), getLongHeight());
        window.getGraphics().fillRect(
                10 + getShortWidth(),
                50 + getLongHeight() - getShortHeight(),
                getLongWidth() - getShortWidth(),
                getShortHeight());
    }

    public void drawUnFilled(JFrame window){
        window.getGraphics().drawRect(10, 50, getShortWidth(), getLongHeight());
        window.getGraphics().drawRect(
                10 + getShortWidth(),
                50 + getLongHeight() - getShortHeight(),
                getLongWidth() - getShortWidth(),
                getShortHeight());
    }
}
