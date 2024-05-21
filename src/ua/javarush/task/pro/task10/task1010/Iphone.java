package ua.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфони
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишіть тут ваш код

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if ( !(obj instanceof Iphone) )
            return false;

        Iphone iphone = (Iphone) obj;

        return this.model == ((Iphone) obj).model && this.color == ((Iphone) obj).color && this.price == ((Iphone) obj).price;
    }


    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
