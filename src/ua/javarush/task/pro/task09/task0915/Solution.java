package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код
        StringTokenizer tkzr = new StringTokenizer(query, delimiter);
        int count = 0;
        String str = "-";
        while (tkzr.hasMoreTokens()){
            String token = tkzr.nextToken();
            str += token + "-";
            count++;
        }
        String[] arr = new String[count];
        int startIndex = 0;
        for (int i = 0; i < count; i++) {
            int indexOfDefis = str.indexOf("-", startIndex + 1);
            arr[i] =  str.substring(startIndex + 1, indexOfDefis);
            startIndex = indexOfDefis;
        }
        return arr;
    }
}
