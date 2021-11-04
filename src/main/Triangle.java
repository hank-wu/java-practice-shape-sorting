package main;

public class Triangle implements IShape{
    private double lengthA, lengthB, lengthC;
    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double s = (lengthA + lengthB + lengthC) / 2;
        s = s * (s - lengthA) * (s - lengthB) * (s - lengthC);
        return Math.pow(s, 0.5);
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}
