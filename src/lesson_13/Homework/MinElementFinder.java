package lesson_13.Homework;

public class MinElementFinder {

    public static void main(String[] args) {
        int[] array = {9, 14, 27, 3, 22, 7};
        int minElement = findMin(array);
        System.out.println("Наименьший элемент массива: " + minElement);
    }

    public static int findMin(int[] ints) {

         if (ints.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int minElement = ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < minElement) {
                minElement = ints[i];
            }
        }

        return minElement;
    }
}

