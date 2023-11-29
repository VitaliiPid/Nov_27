package lesson_14.Homework_14;

public class Homework_02 {
    public static void main(String[] args) {

        /*
        написать метод, проверяющий равенство двух массивов целых чисел. В случае, если массивы равны, метод
        возвращает true,  если нет то false. Массивы равны если они одинаковые
        {1,2,3}
        {1,2,3}
        */

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean result = areyEqual(array1, array2);
        System.out.println("Массивы равны: " + result);
    }

    public static boolean areyEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}