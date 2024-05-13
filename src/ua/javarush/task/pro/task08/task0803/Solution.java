package ua.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Мінімальний елемент масиву
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] arr) {
        //напишіть тут ваш код
        int minimum= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]) < minimum) minimum = arr[i];
        }
        return Math.min(minimum, Integer.MAX_VALUE) ;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код
        int[] arr = new int[10];
        Scanner cons = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cons.nextInt();
        }
        return arr;
    }
}
