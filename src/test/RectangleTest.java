package test;

import main.Rectangle;

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
}