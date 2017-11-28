package csc142.Exam2PartB.one;

public class Oval extends Shapes {
    private int radiusX;
    private int radiusY;

    public Oval(int radiusX, int radiusY) {
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.area = Math.PI * radiusX * radiusY;
        this.perimeter = calcPerimeter(radiusX,radiusY);
    }

    private static double calcPerimeter(double radiusX, double radiusY){
        double temp = Math.PI;
        temp *= (3*(radiusX+radiusY)-Math.sqrt((3*radiusX+radiusY)*(radiusX+2*radiusY)));
        return temp;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(int radiusX) {
        this.radiusX = radiusX;
        this.area = Math.PI * radiusX * radiusY;
        this.perimeter = calcPerimeter(radiusX,radiusY);
    }

    public int getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(int radiusY) {
        this.radiusY = radiusY;
        this.area = Math.PI * radiusX * radiusY;
        this.perimeter = calcPerimeter(radiusX,radiusY);
    }


}
