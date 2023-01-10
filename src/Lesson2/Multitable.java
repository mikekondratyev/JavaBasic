package Lesson2;

import java.util.Scanner;

public class Multitable {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Федя, введи число, и я выведу таблицу умножения для него");
        int a = scanner.nextInt();

        System.out.println("Погнали! ");
        System.out.println(a+" умножить на 1 будет "+ a*1);
        System.out.println(a+" умножить на 2 будет "+ a*2);
        System.out.println(a+" умножить на 3 будет "+ a*3);
        System.out.println(a+" умножить на 4 будет "+ a*4);
        System.out.println(a+" умножить на 5 будет "+ a*5);
        System.out.println(a+" умножить на 6 будет "+ a*6);
        System.out.println(a+" умножить на 7 будет "+ a*7);
        System.out.println(a+" умножить на 8 будет "+ a*8);
        System.out.println(a+" умножить на 9 будет "+ a*9);
        System.out.println(a+" умножить на 10 будет "+ a*10);

    }
}