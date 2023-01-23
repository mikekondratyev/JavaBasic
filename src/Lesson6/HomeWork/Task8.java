package Lesson6.HomeWork;
import java.util.Scanner;

public class Task8 {


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

        if ((x == y) & (x == z) & (y == z)) {
            System.out.println("All numbers are equal");
        } else if ((x != y) & (x != z) & (y != z)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


    }
}

