package com.gmail.s.granovskiy;

public class Triangle extends Shape {
    private Point x;
    private Point y;
    private Point z;

    /*  constructor for Triangle class  */
    public Triangle(Point x, Point y, Point z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Triangle() {
        super();
    }

    /*  getters and setters  */
    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    @Override
    public double getPerimetr() {
        return Point.getDistance(x, y) + Point.getDistance(y, z) + Point.getDistance(z, x);
    }

    @Override
    public double getArea() {
        double p = (Point.getDistance(x, y) + Point.getDistance(y, z) + Point.getDistance(z, x))/2;
        return Math.sqrt(p * (p - Point.getDistance(x, y)) * (p - Point.getDistance(y, z)) * (p - Point.getDistance(z, x)));
    }

    @Override
    public String toString() {
        return "Triangle { a = " + x + ", b = " + y + ", c = " + z + "}";
    }

}
