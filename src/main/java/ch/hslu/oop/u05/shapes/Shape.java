package ch.hslu.oop.u05.shapes;

public abstract class Shape {

    private int x;
    private int y;

    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    protected final int getX() {
        return this.x;
    }

    protected final int getY() {
        return this.y;
    }

    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }

    public abstract int getPerimeter();
    public abstract int getArea();
}
