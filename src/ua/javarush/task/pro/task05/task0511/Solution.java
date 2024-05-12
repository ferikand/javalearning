package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++) {
            int cols = console.nextInt();
            multiArray[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                multiArray[i][j] = 0;
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}
