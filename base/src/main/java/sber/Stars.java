package sber;

public class Stars {

    private static void stars() {
        for (int height = 0; height < 3; height++) {
            for (int length = 0; length < 5; length++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void task() {
        System.out.println("\nЗадача 4: ");
        stars();
    }

}