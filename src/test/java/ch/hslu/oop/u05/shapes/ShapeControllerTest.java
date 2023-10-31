package ch.hslu.oop.u05.shapes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeControllerTest {
    @Test
    public void testGetShapeList() {
        ShapeController shapeController = new ShapeController();
        Circle circle = new Circle(0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Square square = new Square(0, 0, 10);
        shapeController.addShape(circle);
        shapeController.addShape(rectangle);
        shapeController.addShape(square);

        List<Shape> shapeList = shapeController.getShapeList();
        assertEquals(circle, shapeList.get(0));
        assertEquals(rectangle, shapeList.get(1));
        assertEquals(square, shapeList.get(2));
    }

    @Test
    public void testMoveAllShapesTo() {
        ShapeController shapeController = new ShapeController();
        Circle circle = new Circle(0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Square square = new Square(0, 0, 10);
        shapeController.addShape(circle);
        shapeController.addShape(rectangle);
        shapeController.addShape(square);

        shapeController.moveAllShapesTo(10, 20);

        List<Shape> shapeList = shapeController.getShapeList();
        assertEquals(10, shapeList.get(0).getX());
        assertEquals(20, shapeList.get(0).getY());
        assertEquals(10, shapeList.get(1).getX());
        assertEquals(20, shapeList.get(1).getY());
        assertEquals(10, shapeList.get(2).getX());
        assertEquals(20, shapeList.get(2).getY());
    }

    @Test
    public void testGetDiametersOfCircles() {
        ShapeController shapeController = new ShapeController();
        Circle circle = new Circle(0, 0, 10);
        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Square square = new Square(0, 0, 10);
        Circle circle2 = new Circle(0, 0, 20);
        shapeController.addShape(circle);
        shapeController.addShape(rectangle);
        shapeController.addShape(square);
        shapeController.addShape(circle2);

        List<Integer> diameters = shapeController.getDiametersOfCircles();

        assertEquals(10, diameters.get(0));
        assertEquals(20, diameters.get(1));
    }
}
