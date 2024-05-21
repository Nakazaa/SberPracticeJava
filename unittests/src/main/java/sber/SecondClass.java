package sber;

public class SecondClass {

    public int count;

    public void check() {
        FirstClass firstClass = new FirstClass();
        this.count++;
        firstClass.work();
    }

    public void work() {
        System.out.println("Работа второго класса.");
    }

}