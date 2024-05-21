package sber;

public class SubsequenceSeven {

    private static void subsequenceSeven() {
        int cycle = 0;
        while (cycle < 98) {
            cycle += 7;
            System.out.print(cycle + " ");
        }
    }

    public static void task() {
        System.out.println("\nЗадача 1: ");
        subsequenceSeven();
    }

}