package ch.hslu.oop.u05.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testGetX() {
        Rectangle rectangle = new Rectangle(10, 0, 10, 10);
        assertEquals(10, rectangle.getX());
    }

    @Test
    public void testGetY() {
        Rectangle rectangle = new Rectangle(0, 10, 10, 10);
        assertEquals(10, rectangle.getY());
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(40, rectangle.getPerimeter());
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        assertEquals(100, rectangle.getArea());
    }

    @Test
    public void testMove() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        rectangle.move(10, 20);
        assertEquals(10, rectangle.getX());
        assertEquals(20, rectangle.getY());
    }
}
