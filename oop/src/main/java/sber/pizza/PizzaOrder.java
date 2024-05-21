package sber.pizza;

public class PizzaOrder {

    private Size size;
    private boolean withSauce;
    private String address;
    private boolean isAccepted;
    private String name;

    public PizzaOrder(String name, Size size, boolean withSauce, String address) {
        this.name = name;
        this.size = size;
        this.withSauce = withSauce;
        this.address = address;
        System.out.println("Заказ создан.");
    }

    public void order() {
        if (!isAccepted) {
            System.out.println("Заказ принят. "
                    + size.toString() + " пицца \"" + name + "\" "
                    + (withSauce ? "с соусом " : "без соуса ")
                    + "на адрес " + address + ".");
            isAccepted = true;
        } else {
            System.out.println("Заказ уже принят.");
        }
    }

    public void cancel() {
        if (isAccepted) {
            isAccepted = false;
            System.out.println("Заказ отменён.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSauce(boolean withSauce) {
        this.withSauce = withSauce;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return withSauce ? "Да" : "Нет";
    }

    public String getSize() {
        return size.toString();
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Название пиццы: " + getName()
                + "\nРазмер: " + getSize()
                + "\nСоус в заказе: " + getSauce()
                + "\nАдрес: " + getAddress();
    }

}