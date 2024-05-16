package ua.javarush.task.pro.task09.task0912;

/* 
Перевірка URL-адреси
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишіть тут ваш код
       return url.startsWith("https") ? "https" : url.startsWith("http") ? "http" : "невідомий";
    }

    public static String checkDomain(String url) {
        //напишіть тут ваш код
//        if (url == null || url.isEmpty()) {
//            return "Недійсний URL";
//        }
        String domain = "";
        if (url.endsWith(".com")) {
            domain = "com";
        } else if (url.endsWith(".net")) {
            domain = "net";
        } else if (url.endsWith(".org")) {
            domain = "org";
        } else if (url.endsWith(".ua")) {
            domain = "ua";
        } else {
            domain = "невідомий";
        }
        return domain;
    }
}
