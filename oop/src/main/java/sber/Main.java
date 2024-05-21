package sber;

import java.util.Scanner;

import sber.phone.Phone;
import sber.circle.Circle;
import sber.circle.Color;
import sber.matrix.Matrix;
import sber.book.Book;
import sber.book.Author;
import sber.pizza.PizzaOrder;
import sber.pizza.Size;
import sber.paint.*;

public class Main {

    public static void main(String[] args) {
        taskPhone();
        taskCircle();
        taskMatrix();
        taskBook();
        taskPizza();
        taskPaint();
    }

    private static void taskPhone() {
        System.out.println("\nЗадача 1:");
        Phone nokia = new Phone();
        Phone samsung = new Phone("89129877294", "20pro");
        Phone asus = new Phone("89169934167", "5s", 225);
        System.out.println(nokia.toString());
        System.out.println(asus.toString());
        samsung.receiveCall("Никита");
        asus.receiveCall("Евгений", "89936549491");
        asus.sendMessage();
    }

    private static void taskCircle() {
        System.out.println("\nЗадача 2:");
        Circle circle = new Circle(7, Color.Brown);
        System.out.println(circle.toString());
    }

    private static void taskMatrix() {
        System.out.println("\nЗадача 3:");
        Scanner scan = new Scanner(System.in);
        int lines = 3, columns = 3;

        Matrix matrix1 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Введите [" + (line + 1) + ", " + (column + 1) + "] элемент матрицы: ");
                matrix1.setValue(line, column, scan.nextFloat());
            }
        }
        matrix1.getMatrix();

        Matrix matrix2 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Введите [" + (line + 1) + ", " + (column + 1) + "] элемент матрицы: ");
                matrix2.setValue(line, column, scan.nextFloat());
            }
        }
        matrix2.getMatrix();

        matrix1.matrixScalar(3).getMatrix();
        matrix1.matrixMultiply(matrix2).getMatrix();
        matrix1.matrixAdd(matrix2).getMatrix();
    }

    private static void taskBook() {
        System.out.println("\nЗадача 4:");
        Author author = new Author("Н. В. Гоголь", "Мужчина", "qwertyq@mail.ru");
        Book book = new Book("Тарас Бульба", author, 1835);
        System.out.println(author.toString());
        System.out.println(book.toString());

        author.setName("М. И. Цветаева");
        author.setSex("Женщина");
        author.setEmail("cvetmi@mail.ru");
        book.setYear(2011);
        book.setTitle("Вчера ещё в глаза глядел");
        System.out.println(author.toString());
        System.out.println(book.toString());
    }

    private static void taskPizza() {
        System.out.println("\nЗадача 5:");
        PizzaOrder first = new PizzaOrder("Маргарита", Size.BIG, false, "Карла Маркса 12");
        first.order();
        first.order();
        first.cancel();
        first.cancel();
        System.out.println(first.toString());
    }

    private static void taskPaint() {
        System.out.println("\nЗадача 6:");
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(1, 1));
        Square square = new Square(new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(0, 1));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 0), new Point(0, 1), new Point(0, 1));
        sber.paint.Circle circle = new sber.paint.Circle(new Point(1, 0), new Point(-1, 0), new Point(0, 1));

        FigureUtil.area(triangle);
        FigureUtil.perimeter(square);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(circle, sber.paint.Color.Green);
    }

}