package Lesson_16.Homework;

public class Homework_16_2 {
    /*
    Task 2:
    Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе,
    но без первых букв и в верхнем регистре.
    Пример: "Hello", "There" -> ELLOHERE
     */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String result = concatenateAndUppercase(str1, str2);
        System.out.println("Результат: " + result);
    }
    public static String concatenateAndUppercase(String str1, String str2) {
        String result = str1.substring(1) + str2.substring(1);
        return result.toUpperCase();
    }

}
