package sber.paint;

public class Triangle extends Figure implements Drawable {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        System.out.println("Треугольник создан.");
    }

    private String getCords() {
        return "(" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), ("
                + point3.getX() + ", " + point3.getY() + ")";
    }

    @Override
    public void area() {
        double area = 0.5 * (point1.getX() * (point2.getY() - point3.getY()) + point2.getX() * (point3.getY() - point1.getY()) + point3.getX() * (point1.getY() - point2.getY()));
        System.out.println("Площадь треугольника равна: " + area);
    }

    @Override
    public void perimeter() {
        double first = Math.sqrt(Math.pow((point2.getX()) - point1.getX(), 2) + Math.pow((point2.getY() - point1.getY()), 2));
        double second = Math.sqrt(Math.pow((point3.getX()) - point2.getX(), 2) + Math.pow((point3.getY() - point2.getY()), 2));
        double third = Math.sqrt(Math.pow((point1.getX()) - point3.getX(), 2) + Math.pow((point1.getY() - point3.getY()), 2));
        System.out.println("Периметр треугольника равен: " + (first + second + third));
    }

    @Override
    public void draw(Color color) {
        System.out.print("Нарисован ");
        switch (color) {
            case Red:
                System.out.print("красный");
                break;
            case Blue:
                System.out.print("синий");
                break;
            case Green:
                System.out.print("зелёный");
                break;
            case White:
                System.out.print("белый");
                break;
            case Yellow:
                System.out.print("жёлтый");
                break;
        }
        System.out.print(" треугольник с координатами " + getCords());
    }

    public void draw() {
        System.out.println("Нарисован чёрный треугольник с координатами " + getCords());
    }

}
