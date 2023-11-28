package lesson_13.Homework;

public class Fruit {
    public static void main(String[] args) {
/*-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
 */
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
/*Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
*/
        System.out.println("\nЧетные элементы массива:");
        for (int i = 0; i < fruits.length; i++) {

            if (i % 2 == 0) {
                System.out.println(fruits[i]);
            }
        }
    }
}