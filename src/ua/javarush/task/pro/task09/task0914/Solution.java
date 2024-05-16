package ua.javarush.task.pro.task09.task0914;

/* 
Оновлення шляху
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишіть тут ваш код
        int startIndex = path.indexOf("jdk");
        int endIndex = path.indexOf("/", startIndex);
        String start = path.substring(0, startIndex);
        String end = path.substring(endIndex);
        return start + jdk + end;
    }
}
