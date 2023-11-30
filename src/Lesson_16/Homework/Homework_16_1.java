package Lesson_16.Homework;

public class Homework_16_1 {
    /*
    Task 2:
    Написать метод, принимающий строку и возвращающий целое число, равное двойной длине
    строки. Пример: Hello -> 10
     */
    public static void main(String[] args) {
        String inputString = "Hello";
        int result = getDoubleLength(inputString);
        System.out.println("Двойная длина строки: " + result);
    }
    public static int getDoubleLength(String input) {

        return input.length() * 2;
    }
}
