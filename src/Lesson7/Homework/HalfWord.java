package Lesson7.Homework;
//First level: 1.Введите 2 слова, используйте сканер, состоящий из четного количества букв
// (проверьте количество букв в слове).
//        Получить слово, состоящее из первой половины первого слова
//        и второй половины второго слова. распечатать на консоль.


import java.util.Scanner;

public class HalfWord {


    public static void main(String[] args) {
        boolean isEven = true;

while (isEven) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter word 1 (letter count must be even)");
    String userInputStr1 = scanner.nextLine();

    int strLength1 = userInputStr1.length();

    System.out.println("Enter word 2 (letter count must be even)");
    String userInputStr2 = scanner.nextLine();
    int strLength2 = userInputStr2.length();


    if (strLength1 % 2 == 0 && strLength2 % 2 == 0) {
        System.out.println(userInputStr1.substring(0, strLength1 / 2)
                + userInputStr2.substring(strLength2/2, strLength2));
        isEven = false;
    } else {
        System.out.println("You enter wrong words");

}

    }
    }
}
