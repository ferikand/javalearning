package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];
            for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) max = array[j];
        }
        System.out.println(max);
    }
}
