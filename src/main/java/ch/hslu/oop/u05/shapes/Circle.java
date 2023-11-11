package ch.hslu.oop.u05.shapes;

public final class Circle extends Shape {
    private int diameter;

    public Circle (final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * this.diameter);
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (this.diameter / 2.0) * (this.diameter / 2.0));
    }


    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(final int diameter) {
        this.diameter = diameter;
    }
}
