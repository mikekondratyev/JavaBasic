package Lesson7.Homework.Calc;

import java.util.Scanner;

//Реализовать программу, выводящую на экран результаты сложения, вычитания,
//        умножения и деления двух чисел. Каждая из арифметических операций
//        должна быть реализована как отдельный метод.
public class Calc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X");
        int x = scanner.nextInt();

        System.out.println("Input Y");
        int y= scanner.nextInt();

        Utils utils = new Utils();

        System.out.println("Sum is " + (utils.Summa(x, y)));
        System.out.println( "Mult is " + (utils.Mult(x, y)));
        System.out.println( "Diff is " + (utils.Diff(x, y)));
        System.out.println( "Split is " + (utils.Split(x, y)));

    }





}

