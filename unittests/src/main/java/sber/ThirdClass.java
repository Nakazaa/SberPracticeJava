package sber;

public class ThirdClass {

    public String work(FirstClass firstClass, SecondClass secondClass) {
        firstClass.check();
        secondClass.check();
        return "Done.";
    }

    public void exception() throws Exception {
        throw new Exception("Екзептион!");
    }

    private String work() {
        return "Приватная работа третьего класса";
    }

}