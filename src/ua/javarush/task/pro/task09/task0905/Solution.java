package ua.javarush.task.pro.task09.task0905;

import java.util.Map;
import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) return 0;
        int octNum = 0;
        int i = 0;
        while (decimalNumber != 0){
            octNum = octNum + (decimalNumber % 8) * (int) Math.pow(10, i);
            decimalNumber = decimalNumber / 8;
            i++;
        }

        return octNum;
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код
        if (octalNumber <= 0) return 0;
        int decNum = 0;
        int i = 0;
        while (octalNumber != 0) {
            decNum = decNum + (octalNumber % 10) * (int) Math.pow(8, i);
            octalNumber = octalNumber / 10;
            i++;
        }

        return decNum;
    }
}
