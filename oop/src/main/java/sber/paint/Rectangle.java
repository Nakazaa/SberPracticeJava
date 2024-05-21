package sber.paint;

public class Rectangle extends Figure implements Drawable {

    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final Point point4;

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        System.out.println("Прямоугольник создан.");
    }

    private String getCords() {
        return "(" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), ("
                + point3.getX() + ", " + point3.getY() + "), ("
                + point4.getX() + ", " + point4.getY() + ")";
    }

    @Override
    public void area() {
        double area = Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2)) *
                Math.sqrt(Math.pow((point4.getX() - point1.getX()), 2) + Math.pow((point4.getY() - point1.getY()), 2));
        System.out.println("Площадь прямоугольника равна: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * (Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2)) +
                Math.sqrt(Math.pow((point4.getX() - point1.getX()), 2) + Math.pow((point4.getY() - point1.getY()), 2)));
        System.out.println("Периметр прямоугольника: " + perimeter);
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
        System.out.print(" прямоугольник с координатами " + getCords());
    }

    public void draw() {
        System.out.println("Нарисован чёрный прямоугольник с координатами " + getCords());
    }

}