package test;

import main.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        circle = new Circle(5);
    }

    @org.junit.jupiter.api.Test
    void area() {
        assertEquals(78.5398163, circle.area(),0.000001);
    }

    @org.junit.jupiter.api.Test
    void perimeter() {
        assertEquals( 31.4159265, circle.perimeter(), 0.000001);
    }
}