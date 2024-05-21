package sber;

public class PrimeNum {

    private static void primeNumbers() {
        boolean simple;
        for (int cycle1 = 2; cycle1 < 100; cycle1++) {
            simple = true;
            for (int cycle2 = 2; cycle2 < cycle1 - 1; cycle2++) {
                if (cycle1 % cycle2 == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(cycle1 + " ");
            }
        }
    }

    public static void task() {
        System.out.println("\nЗадача 3: ");
        primeNumbers();
    }

}