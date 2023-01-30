package Lesson6.HomeWork;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи Х");
        x = scanner.nextInt();
        System.out.println("Введи У");
        y = scanner.nextInt();
        System.out.println("Введи Z");
        z = scanner.nextInt();

        if ((x < y) && (y < z)) {
            System.out.println("Increasing");
        } else if ((x > y) && (y > z) ) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }


    }

}
