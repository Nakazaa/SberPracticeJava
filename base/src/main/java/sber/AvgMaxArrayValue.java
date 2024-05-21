package sber;

public class AvgMaxArrayValue {

    private static void avgMaxArrayValue() {
        int[] array = new int[10];
        int max = array[0];
        float sum = 0;
        System.out.print("Массив: ");
        for (int cycle = 0; cycle < array.length; cycle++) {
            array[cycle] = ((int) (Math.random() * 11));
            System.out.print(array[cycle] + " ");
            sum += array[cycle];
            if (array[cycle] > max)
                max = array[cycle];
        }
        System.out.print("\nСреднее значение в массиве: " + sum / array.length + "\nМаксимальное значение в массиве: " + max);
    }

    public static void task() {
        System.out.println("\nЗадача 2: ");
        avgMaxArrayValue();
    }

}
