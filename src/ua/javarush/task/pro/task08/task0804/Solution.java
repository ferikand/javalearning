package ua.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишіть тут ваш код
        int x = (int) (Math.random()*99);
        return x;
    }
}
