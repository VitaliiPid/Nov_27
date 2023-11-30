package lesson_14.Homework_14;

public class Homework_02 {
    public static void main(String[] args) {

        /*
        Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
        Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
        */

        int[] array = {1, 2, 8, 7};
        int count = countEvenNumbers(array);
        System.out.println("Количество четных чисел в массиве: " + count);
    }

    public static int countEvenNumbers(int[] numbers) {
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}