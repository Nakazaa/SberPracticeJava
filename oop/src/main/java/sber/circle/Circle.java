package sber.circle;

import static java.lang.Math.*;

public class Circle {

    private final float radius;
    private final Color color;

    public Circle (float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return radius * pow(PI, 2);
    }

    public double perimeter() {
        return PI * 2 * radius;
    }

    public String toString() {
        return "Radius = " + radius
                + "\nColor = " + color
                + "\nArea = " + area()
                + "\nPerimeter = " + perimeter();
    }

}
