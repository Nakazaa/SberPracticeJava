package sber.pizza;

public enum Size {

    SMALL("Маленькая"),
    MEDIUM("Средняя"),
    BIG("Большая");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String toString() {
        return size;
    }

}