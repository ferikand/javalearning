package ua.javarush.task.pro.task10.task1012;

/*
Дефрагментація пам'яті
*/

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишіть тут ваш код
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) count++;
        }
        String[] copyOfArray = new String[count];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                copyOfArray[count2] = array[i];
                count2++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i < copyOfArray.length) {
                array[i] = copyOfArray[i];
            } else {
                array[i] = null;
            }
        }
    }
}
