package sber;

public class FirstClass {

    public int count;

    public void check() {
        SecondClass secondClass = new SecondClass();
        this.count++;
        secondClass.work();
    }

    public void work() {
        System.out.println("Работа первого класса.");
    }

}