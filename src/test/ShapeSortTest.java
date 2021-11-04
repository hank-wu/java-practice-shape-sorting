package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShapeSortTest {
    ArrayList<IShape>shapeList;
    ShapeSort shapeSort;
    @BeforeEach
    void setUp() {
        shapeList = new ArrayList<IShape>();
        shapeList.add(new Circle(5));
        shapeList.add(new Triangle(3,4,5));
        shapeList.add(new Rectangle(5,6));
        shapeSort = new ShapeSort();

    }

    @Test
    void executeByAreaAsc() {
        shapeSort.setList(shapeList);
        shapeSort.executeBy("area", "asc");
        assertEquals(6, shapeList.get(0).area(),0.000001);
        assertEquals(30,shapeList.get(1).area(), 0.000001);
        assertEquals(78.5398163,shapeList.get(2).area(), 0.000001);
    }

    @Test
    void executeByAreaDesc() {
        shapeSort.setList(shapeList);
        shapeSort.executeBy("area", "desc");
        assertEquals(78.5398163,shapeList.get(0).area(), 0.000001);
        assertEquals(30,shapeList.get(1).area(), 0.000001);
        assertEquals(6, shapeList.get(2).area(),0.000001);
    }

    @Test
    void executeByPerimeterAsc() {
        shapeSort.setList(shapeList);
        shapeSort.executeBy("perimeter", "asc");
        assertEquals(12,shapeList.get(0).perimeter(), 0.000001);
        assertEquals(22,shapeList.get(1).perimeter(), 0.000001);
        assertEquals(31.4159265, shapeList.get(2).perimeter(),0.000001);
    }

    @Test
    void executeByPerimeterDesc() {
        shapeSort.setList(shapeList);
        shapeSort.executeBy("perimeter", "desc");
        assertEquals(12,shapeList.get(0).perimeter(), 0.000001);
        assertEquals(22,shapeList.get(1).perimeter(), 0.000001);
        assertEquals(31.4159265, shapeList.get(2).perimeter(),0.000001);
    }
}