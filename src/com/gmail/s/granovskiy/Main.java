package com.gmail.s.granovskiy;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*  point a  */
        Point a = new Point(0.2, 2.1);
        System.out.println("Point a: " + a.toString());

        /*  point b  */
        Point b = new Point(0.3, 7.5);
        System.out.println("Point b: " + b.toString());

        /*  point c  */
        Point c = new Point(3.2, 6.1);
        System.out.println("Point c: " + c.toString());
        System.out.println();

        /*  the distance between a and b  */
        System.out.println("The distance between a and b: " + Point.getDistance(a, b));

        /*  the distance between b and c  */
        System.out.println("The distance between b and c: " + Point.getDistance(b, c));

        /*  the distance between c and d  */
        System.out.println("The distance between c and a: " + Point.getDistance(c, a));
        System.out.println();


        /*  the result of methods work toString(), getPerimetr(), getArea() with the object circleOne  */

        /*  creating object circleOne */
        Circle circleOne = new Circle(a,b);
        System.out.println("This is the string representation of the object circleOne: ");
        System.out.println(circleOne.toString());

        /*  The perimeter of the circleOne  */
        System.out.println("The perimeter of the circleOne is: " + circleOne.getPerimetr());

        /*  The area of the circleOne  */
        System.out.println("The area of the circleOne is: " + circleOne.getArea());
        System.out.println();

        /*  the result of methods work toString(), getPerimetr(), getArea() with the object triangleOne  */

        /*  creating object triangleOne */
        Triangle triangleOne = new Triangle(a,b,c);
        System.out.println("This is the string representation of the object triangleOne: ");
        System.out.println(triangleOne.toString());

        /*  The perimeter of the triangleOne  */
        System.out.println("The perimeter of the triangleOne is: " + triangleOne.getPerimetr());

        /*  The area of the triangleOne  */
        System.out.println("The area of the triangleOne is: " + triangleOne.getArea());
        System.out.println();

    }
}

