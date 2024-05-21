package sber.paint;

public class FigureUtil {

    private FigureUtil() {
    }

    public static void area(Figure figure) {
        figure.area();
    }

    public static void perimeter(Figure figure) {
        figure.perimeter();
    }

    public static void draw(Drawable figure) {
        figure.draw();
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }

}