package main;

public class Circle implements IShape{
    private double radius;
    public Circle(double radius){
        if(radius <= 0.0)
            throw new ShapeException("Not valid Circle!");
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
