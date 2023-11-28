package lesson_13.Homework;

public class Fruit {
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        System.out.println("Исходный массив:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        fruits[0] = "Kiwi";

        System.out.println("\nМассив после замены:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("\nЧетные элементы массива:");
        for (int i = 0; i < fruits.length; i++) {

            if (i % 2 == 0) {
                System.out.println(fruits[i]);
            }
        }
    }
}