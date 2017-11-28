package csc142.Exam2PartB.one;

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

    private void calcAreaAndPerimeter(){
        this.perimeter=2*(longHeight+longWidth);
        this.area=(shortWidth*longHeight)+(shortHeight*(longWidth-shortWidth));
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
}
