package main;

public class Rectangle implements IShape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return (length + width) * 2;
    }
}
