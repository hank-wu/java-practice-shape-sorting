package main;

public class Triangle implements IShape{
    private double lengthA, lengthB, lengthC;
    public Triangle(double lengthA, double lengthB, double lengthC) {
        if(lengthA<= 0.0 || lengthB<=0.0 || lengthC<=0.0)
            throw new ShapeException("There is a input length less than zero ,so it's not a valid Triangle!");

        if(lengthA+ lengthB <= lengthC || Math.abs(lengthA - lengthB) >= lengthC)
            throw new ShapeException("The relation of the three length doesn't satisfy the condition of Triangle!");

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
