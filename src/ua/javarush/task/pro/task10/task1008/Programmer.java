package ua.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    //напишіть тут ваш код


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = this.salary > salary ? this.salary : salary;
    }
}
