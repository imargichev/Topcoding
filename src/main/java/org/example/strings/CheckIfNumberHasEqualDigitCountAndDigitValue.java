package org.example.strings;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(num);
    }
    public static boolean digitCount(String num) {
        int[] frequency = new int[num.length()]; // Масив за броене на честотата на всеки индекс.

        // Преброяване на честотата на всеки индекс.
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i)); // Преобразуване на символа в число.
            if (digit < num.length()) { // Само ако индексът е валиден (по-малък от дължината на стринга).
                frequency[digit]++;
            }
        }

        // Проверка на условието.
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = Character.getNumericValue(num.charAt(i)); // Колко пъти индексът трябва да се появи.
            if (frequency[i] != expectedCount) { // Сравняваме очакваното със реалното.
                return false; // Условие нарушено, връщаме false.
            }
        }

        return true; // Всички условия са изпълнени.
    }
}
