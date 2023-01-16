package Lesson3.Dog;
import java.util.Scanner;
public class DogDemo {
    public static void main(String[] args) {
        Dog dog=new Dog();
dog.nameDog="Ser";
dog.age=56;
dog.color="fresh";
dog.newcolor="super";
        //Scanner scanner = new Scanner (System.in);
        //System.out.println("Введи имя пса");
        //dog.nameDog = scanner.nextLine();
        //dog.setName(dog.nameDog);
        dog.Voice();
        dog.ChColor();
        dog.age= dog.age+1;
        dog.Voice();
    }
}