package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишіть тут ваш код
        char[] digits = string.toCharArray();
        int count = 0;
        for (char digit : digits){
            if (Character.isDigit(digit)) count++;
        }
        return count;
    }

    public static int countLetters(String string) {
        //напишіть тут ваш код
        char[] digits = string.toCharArray();
        int count = 0;
        for (char digit : digits){
            if (Character.isLetter(digit)) count++;
        }
        return count;
    }

    public static int countSpaces(String string) {
        char[] digits = string.toCharArray();
        int count = 0;
        for (char digit : digits){
            if (Character.isSpaceChar(digit)) count++;
        }
        return count;
    }
}
