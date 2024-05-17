package ua.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати . Я зароблятиму $ на місяць.";
        //напишіть тут ваш код
        StringBuilder newPhrase = new StringBuilder(phrase);
        int indexOfDot = phrase.indexOf(".");
        int indexOfMoney = phrase.indexOf("$");
        newPhrase.insert(indexOfDot, "%s").insert(indexOfMoney + 3, "%d");
        String result = newPhrase.toString();

        return String.format(result, name, salary);
    }
}
