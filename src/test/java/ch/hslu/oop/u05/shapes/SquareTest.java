package ch.hslu.oop.u05.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testGetX() {
        Square square = new Square(10, 0, 10);
        assertEquals(10, square.getX());
    }

    @Test
    public void testGetY() {
        Square square = new Square(0, 10, 10);
        assertEquals(10, square.getY());
    }

    @Test void testGetWidth() {
        Square square = new Square(0, 0, 10);
        assertEquals(10, square.getWidth());
    }

    @Test void testGetHeight() {
        Square square = new Square(0, 0, 10);
        assertEquals(10, square.getHeight());
    }

    @Test void testGetPerimeter() {
        Square square = new Square(0, 0, 10);
        assertEquals(40, square.getPerimeter());
    }

    @Test void testGetArea() {
        Square square = new Square(0, 0, 10);
        assertEquals(100, square.getArea());
    }
}
