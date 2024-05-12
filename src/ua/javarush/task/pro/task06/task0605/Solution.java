package ua.javarush.task.pro.task06.task0605;

/* 
Правильний порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишіть тут ваш код
        int[] rev = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = rev[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
