package ua.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) return "";
        String hexStr = "";
        while (decimalNumber != 0 ) {
            hexStr = HEX.charAt(decimalNumber % 16) + hexStr;
            decimalNumber = decimalNumber / 16;
        }
        return hexStr;
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == "" || hexNumber == null) return 0;
        int decNum = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char digit = hexNumber.charAt(i);
            int digitValue = 0;
            if (digit >= '0' && digit <= '9') {
                digitValue = digit - '0';
            } else if (digit >= 'a' && digit <= 'f') {
                digitValue = 10 + (digit - 'a');
            }
            decNum = 16 * decNum + digitValue;
        }
        return decNum;
    }
}
