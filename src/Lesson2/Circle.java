package Lesson2;

import java.util.Scanner;


    public class Circle {
        public static void main (String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите радиус круга");
            double r = scanner.nextDouble();

            System.out.println("Погнали! Радиус круга равен "+r);
            System.out.println("Площадь круга равна "+ r*r*3.14);
            System.out.println("Длина окружности "+ r*3.14*2);
}
    }
