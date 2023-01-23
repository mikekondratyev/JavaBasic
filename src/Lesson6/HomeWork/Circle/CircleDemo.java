package Lesson6.HomeWork.Circle;

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Input radius");

        Scanner input=new Scanner(System.in);
        double radius = input.nextDouble();

System.out.println("S="+circle.Area(radius));
    }

}
