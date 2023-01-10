package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введи 1 число");
        Double firstDouble = scanner.nextDouble();
        System.out.println("Введи 2 число");
        Double secondDouble = scanner.nextDouble();
        Double sum=firstDouble + secondDouble;
        Double split=firstDouble - secondDouble;
        Double div=firstDouble / secondDouble;
        Double mult=firstDouble * secondDouble;

        System.out.println("Сумма " + sum);
        System.out.println("Разность " + split);
        System.out.println("Частное " + div);
        System.out.println("Произведение " + mult);
    }

}