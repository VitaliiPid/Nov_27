package Lesson_15.Homework_15;

    /*
    Task 1
    Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
    Метод возвращает false если нет и true если да.
    т.е. для массива 10, 15, 10, 1, 25, 10 -> true
    для массива 10, 15, 10, 1, 25, 45 -> false
    Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m

   */
public class Homework_15 {
    public static void main(String[] args) {
        int[] array1 = {10, 15, 10, 1, 25, 10};
        int[] array2 = {10, 15, 10, 1, 25, 45};

        boolean result1 = checkSum(array1, 10, 30);
        boolean result2 = checkSum(array2, 10, 30);

        System.out.println("For array1: " + result1);
        System.out.println("For array2: " + result2);
    }

    public static boolean checkSum(int[] array, int m, int n) {
        int sum = 0;

        for (int number : array) {
            if (number == m) {
                sum += number;
            }
        }

        return sum == n;
    }
}

