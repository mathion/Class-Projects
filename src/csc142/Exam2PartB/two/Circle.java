package csc142.Exam2PartB.two;

import csc142.Exam2PartB.one.Oval;

public class Circle extends Oval {
    //A circle is just an oval with equal radii
    public Circle(int diameter) {
        super(diameter, diameter);
    }


    public String getInfo() {
        //only a single radius used instead of two in oval
        String tempString = "Diameter = " + getDiameterX() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }
}
