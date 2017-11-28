package csc142.Exam2PartB.one;

public class Rectangle extends Shapes {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width + height);
    }
}
