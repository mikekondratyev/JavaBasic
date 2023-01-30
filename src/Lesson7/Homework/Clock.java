package Lesson7.Homework;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        int n = (int) (Math.random()*(28800));

    System.out.println("До конца работы осталось " + n + " секунд");
        if (n>3600) {System.out.println("До конца работы осталось примерно " + n / 3600 + " ч");}
        else {
            System.out.println("До конца работы менее часа");

}
    }
        }




