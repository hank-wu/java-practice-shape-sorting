package main;

public class Circle implements IShape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
