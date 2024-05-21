package sber.book;

public class Book {

    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Book Created.");
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "\nTitle: " + getTitle()
                + "\nAuthor: " + author.getName() + " (" + author.getSex() + ") " + author.getEmail()
                + "\nYear: " + getYear();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
