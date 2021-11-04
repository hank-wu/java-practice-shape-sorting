package test;

import main.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private Triangle triangle;
    @BeforeEach
    void setUp() {
        triangle = new Triangle(3, 4,5);
    }

    @Test
    void area() {
        assertEquals(6, triangle.area(), 0.000001);
    }

    @Test
    void perimeter() {
        assertEquals(12, triangle.perimeter(),0.000001);
    }
}