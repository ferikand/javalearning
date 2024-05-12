package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }
        String[] copyStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            copyStrings[i] = strings[i];
        }
        for (int i = 0; i < strings.length; i++) {
            int counter = 0;
            for (int j = 0; j < copyStrings.length; j++) {
                if (copyStrings[j].equals(strings[i])) {
                    counter++;
                    if(counter > 1 && copyStrings[j].equals(strings[i])) strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
