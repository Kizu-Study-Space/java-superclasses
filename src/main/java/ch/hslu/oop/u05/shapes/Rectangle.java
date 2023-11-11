package ch.hslu.oop.u05.shapes;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public final int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public final int getArea() {
        return this.width * this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }
}
