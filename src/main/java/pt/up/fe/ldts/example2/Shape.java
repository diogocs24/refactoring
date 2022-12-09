package pt.up.fe.ldts.example2;

public abstract class Shape {

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private final double x;
    private final double y;
    protected double width;
    protected double height;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double radius; // ONLY FOR CIRCLES


    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicFramework graphics);
}