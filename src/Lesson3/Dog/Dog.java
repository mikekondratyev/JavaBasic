package Lesson3.Dog;

import java.util.Scanner;

public class Dog {
    public String getNameDog() {
        return nameDog;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getNewcolor() {
        return newcolor;
    }

    String nameDog;
    int age;
    String color;
    String newcolor;
    //public void setName(String nameDog) {
    //    this.nameDog = nameDog;
    //}
    public void Voice() {
        System.out.println(nameDog + nameDog + nameDog);
        System.out.println(age);
        System.out.println(color);
    }

        public void ChColor() {
        color=newcolor;
        }


    }

