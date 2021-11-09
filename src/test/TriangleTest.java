package test;

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
}