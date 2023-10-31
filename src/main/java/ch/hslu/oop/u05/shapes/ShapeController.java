package ch.hslu.oop.u05.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeController {

    private List<Shape> shapeList;

    public ShapeController() {
        this.shapeList = new ArrayList<>();
    }

    public void addShape(final Shape shape) {
        this.shapeList.add(shape);
    }

    public List<Shape> getShapeList() {
        return this.shapeList;
    }

    public void moveAllShapesTo(int newX, int newY) {
        for (Shape shape: shapeList ) {
            shape.move(newX, newY);
        }
    }
}
