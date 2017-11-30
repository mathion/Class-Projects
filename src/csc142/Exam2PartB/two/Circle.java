package csc142.Exam2PartB.two;

import csc142.Exam2PartB.one.Oval;

public class Circle extends Oval {

    public Circle(int radius) {
        super(radius, radius);
    }


    public String getInfo() {

        String tempString = "Radius = " + getRadiusX() + "\n";
        tempString += "Area = " + getArea() + "\n";
        tempString += "Perimeter = " + getPerimeter() + "\n";

        return tempString;
    }
}
