package se.lexicon;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    height = 5;
    width = 10;
    }

    public Rectangle(double height, Double width) {
       this.width = width;
       this.height = height;
    }

    public double getArea() {
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
