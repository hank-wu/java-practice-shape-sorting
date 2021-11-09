package test;

import main.Circle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {
    private Circle circle;

    @BeforeEach
    public void setUp() throws Exception {
        circle = new Circle(5);
    }

    @Test
    @DisplayName("Circleオブジェクトの面積を検証")
    void area() {
        assertEquals(78.5398163, circle.area(),0.000001);
    }

    @Test
    @DisplayName("Circleオブジェクトの周長を検証")
    void perimeter() {
        assertEquals( 31.4159265, circle.perimeter(), 0.000001);
    }
}