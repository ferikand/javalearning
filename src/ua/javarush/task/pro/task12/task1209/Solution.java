package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Гвінно");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Боргелейф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Боргелейф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary(null);
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Іногрім");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Альбіуф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Ніфрод");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Гунігерд");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Фріле");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
        if (name == null) {
            return;
        }
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}
