package ch.hslu.oop.u05.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testGetX() {
        Circle circle = new Circle(10, 0, 10);
        assertEquals(10, circle.getX());
    }

    @Test
    public void testGetY() {
        Circle circle = new Circle(0, 10, 10);
        assertEquals(10, circle.getY());
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(0, 0, 10);
        assertEquals(31, circle.getPerimeter());
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle(0, 0, 10);
        assertEquals(78, circle.getArea());
    }

    @Test
    public void testGetDiameter() {
        Circle circle = new Circle(0, 0, 10);
        assertEquals(10, circle.getDiameter());
    }

    @Test
    public  void testSetDiameter() {
        Circle circle = new Circle(0, 0, 10);
        circle.setDiameter(20);
        assertEquals(20, circle.getDiameter());
    }

    @Test
    public void testMove() {
        Circle circle = new Circle(0, 0, 10);
        circle.move(10, 20);
        assertEquals(10, circle.getX());
        assertEquals(20, circle.getY());
    }
}
