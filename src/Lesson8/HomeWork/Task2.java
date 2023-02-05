package Lesson8.HomeWork;
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на экран в строку.
//        Определите и выведите на экран сообщение о том,
//        является ли массив строго возрастающей последовательностью.
public class Task2 {

    public static void main(String[] args) {
        int [] array = new int[50];
        for (int i=0; i<array.length; i++) {
            array [i] = (int) ((Math.random()*(90)+10));

        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array [i] + " ");

        }
        System.out.println();

if ((array[0]<array[1])&&(array[1]<array[2])&&(array[2]<array[3])&&(array[3]<array[4]))
{System.out.println("Array is rise");}


    }

}
