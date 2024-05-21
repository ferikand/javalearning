package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

public class Solution {

    public static void showWeather(City city) {
        //напишіть тут ваш код
        System.out.println(String.format("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        City city = new City("Kyiv", 20);
        showWeather(city);
    }
}
