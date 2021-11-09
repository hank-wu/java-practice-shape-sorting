package test;

import main.IShape;
import main.Rectangle;

import main.ShapeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(5, 6);
    }

    @Test
    @DisplayName("Rectangleオブジェクトの面積を検証")
    void area() {
        assertEquals(30, rectangle.area(), 0.000001);
    }

    @Test
    @DisplayName("Rectangleオブジェクトの周長を検証")
    void perimeter() {
        assertEquals(22, rectangle.perimeter(), 0.000001);
    }

    @Test
    @DisplayName("Rectangleオブジェクトは長さが-1によって、作り失敗")
    void rectangleWithInvalidLength() {
        IShape testShape;
        String errorMessage = "";
        try{
            testShape = new Rectangle(-1, 5);
        }catch (ShapeException e){
            errorMessage = e.getMessage();
        }
        assertEquals("Not valid Rectangle!", errorMessage);
    }

    @Test
    @DisplayName("Rectangleオブジェクトは幅が-1によって、作り失敗")
    void rectangleWithInvalidWidth() {
        IShape testShape;
        String errorMessage = "";
        try{
            testShape = new Rectangle(5, -1);
        }catch (ShapeException e){
            errorMessage = e.getMessage();
        }
        assertEquals("Not valid Rectangle!", errorMessage);
    }
}