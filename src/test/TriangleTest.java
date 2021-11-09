package test;

import main.IShape;
import main.ShapeException;
import main.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;
    @BeforeEach
    void setUp() {
        triangle = new Triangle(3, 4,5);
    }

    @Test
    @DisplayName("Triangleオブジェクトの面積を検証")
    void area() {
        assertEquals(6, triangle.area(), 0.000001);
    }

    @Test
    @DisplayName("Triangleオブジェクトの周長を検証")
    void perimeter() {
        assertEquals(12, triangle.perimeter(),0.000001);
    }

    @Test
    @DisplayName("Triangleオブジェクトは辺の一つが-1によって、作り失敗")
    void triangleWithMinusLength() {
        IShape testShape;
        String errorMessage = "";
        try{
            testShape = new Triangle(-1, 3,4);
        }catch (ShapeException e){
            errorMessage = e.getMessage();
        }
        assertEquals("There is a input length less than zero ,so it's not a valid Triangle!", errorMessage);
    }

    @Test
    @DisplayName("Triangleオブジェクトは三つの辺が条件を満たさないので、作り失敗")
    void triangleWithWrongLengthCondition() {
        IShape testShape;
        String errorMessage = "";
        try{
            testShape = new Triangle(1, 1,100);
        }catch (ShapeException e){
            errorMessage = e.getMessage();
        }
        assertEquals("The relation of the three length doesn't satisfy the condition of Triangle!", errorMessage);
    }
}