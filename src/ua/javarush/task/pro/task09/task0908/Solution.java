package ua.javarush.task.pro.task09.task0908;

/*
Двійково-шістнадцятковий конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String res = "";
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String temp = binaryNumber.substring(i, i + 4);
            while (temp.length() < 4) {
                temp = "0" + temp;
            }
            if (temp.equals("0000")) {
                res = res + "0";
            } else {
                res = res + toHex(toDecimal(temp));
            }
        }
        return res;
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber < 0 || decimalNumber > 15) {
            return "";
        }
        String HEX = "0123456789abcdef";
        String hexStr = "";
        while (decimalNumber != 0 ) {
            hexStr = HEX.charAt(decimalNumber % 16) + hexStr;
            decimalNumber = decimalNumber / 16;
        }
        return hexStr;
    }

    public static String toBinary(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || !hexNumber.matches("[0-9a-f]+") || hexNumber.isEmpty()) {
            return "";
        }
        return toBinaryFromDec(toDecimalFromHex(hexNumber));
    }

    public static String toBinaryFromDec(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber < 0) {
            return "";
        }
        if (decimalNumber == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimalNumber != 0) {
            binary.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        return binary.toString();
    }

    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return 0;
        }
        int decNum = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char digit = binaryNumber.charAt(i);
            decNum += (int) ((digit - '0') * Math.pow(2, binaryNumber.length() - 1 - i));
        }
        return decNum;
    }

    public static int toDecimalFromHex(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return 0;
        }
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
