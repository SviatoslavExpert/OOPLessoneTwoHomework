package com.gmail.s.granovskiy;

/*  class Circle inherits class Shape  */
public class Circle extends Shape {
    private Point x;
    private Point y;

    /*  constructor  */
    public Circle(Point x, Point y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Circle() {
        super();
        // TODO Auto-generated constructor stub
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

    /*  methods of class Circle  */
    @Override
    public double getPerimetr() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * Point.getDistance(x, y);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(Point.getDistance(x, y), 2);
    }

    @Override
    public String toString() {
        return "Circle { a = " + x + ", b = " + y + "}";
    }
}
