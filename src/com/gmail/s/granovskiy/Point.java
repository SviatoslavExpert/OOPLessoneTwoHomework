package com.gmail.s.granovskiy;

public class Point {
    private double x;
    private double y;

    /*  Point constructor  */
    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    /*  getters and setters  */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*  method getDistance  */
    public static double getDistance(Point a, Point b){
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }

    /*  method toString  */
    @Override
    public String toString() {
        return "Point [" + "x = " + x + ", y = " + y + "]";
    }
}
