package sber.paint;

public class Circle extends Figure implements Drawable {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Circle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        System.out.println("Окружность создана.");
    }

    private String getCords() {
        return "(" + point1.getX() + ", " + point1.getY() + "), ("
                + point2.getX() + ", " + point2.getY() + "), ("
                + point3.getX() + ", " + point3.getY() + ")";
    }

    @Override
    public void area() {
        double A = point2.getX() - point1.getX();
        double B = point2.getY() - point1.getY();
        double C = point3.getX() - point1.getX();
        double D = point3.getY() - point1.getY();
        double E = A * (point1.getX() + point2.getX()) + B * (point1.getY() + point2.getY());
        double F = C * (point1.getX() + point3.getX()) + D * (point1.getY() + point3.getY());
        double G = 2 * (A * (point3.getY() - point2.getY()) - B * (point3.getX() - point2.getX()));
        double centerX = (D * E - B * F) / G;
        double centerY = (A * F - C * E) / G;
        double radius = Math.sqrt((centerX - point1.getX()) * (centerX - point1.getX()) + (centerY - point1.getY()) * (centerY - point1.getY()));
        double area = Math.PI * radius * radius;
        System.out.println("Площадь окружности равна: " + area);
    }

    @Override
    public void perimeter() {
        double A = point2.getX() - point1.getX();
        double B = point2.getY() - point1.getY();
        double C = point3.getX() - point1.getX();
        double D = point3.getY() - point1.getY();
        double E = A * (point1.getX() + point2.getX()) + B * (point1.getY() + point2.getY());
        double F = C * (point1.getX() + point3.getX()) + D * (point1.getY() + point3.getY());
        double G = 2 * (A * (point3.getY() - point2.getY()) - B * (point3.getX() - point2.getX()));
        double centerX = (D * E - B * F) / G;
        double centerY = (A * F - C * E) / G;
        double radius = Math.sqrt((centerX - point1.getX()) * (centerX - point1.getX()) + (centerY - point1.getY()) * (centerY - point1.getY()));
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Периметр окружности равен: " + perimeter);
    }

    @Override
    public void draw(Color color) {
        System.out.print("Нарисована ");
        switch (color) {
            case Red:
                System.out.print("красная");
                break;
            case Blue:
                System.out.print("синяя");
                break;
            case Green:
                System.out.print("зелёная");
                break;
            case White:
                System.out.print("белая");
                break;
            case Yellow:
                System.out.print("жёлтая");
                break;
        }
        System.out.print(" окружность пересекающая координаты " + getCords());
    }

    public void draw() {
        System.out.println("Нарисована чёрная окружность пересекающая координаты " + getCords());
    }

}
