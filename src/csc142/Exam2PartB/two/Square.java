package csc142.Exam2PartB.two;

import csc142.Exam2PartB.one.Rectangle;

public class Square extends Rectangle {
    //a square is just a rectangle with equal width and height
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }

    public String getInfo() {

        String tempString = "Side Length = " + getWidth() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }
}
