package Lesson8.HomeWork.Task4;
//4* Дан массив из N целых чисел и целое число K ,
// найдите количество пар элементов в массиве,
// сумма которых равна K.
//        Пример 1:
//        Вход:
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Вывод: 2 пары чисел
//        Объяснение:
//        arr[0] + arr[1] = 1 + 5 = 6
//        arr[1] + arr[3] = 5 + 1 = 6.
//        Пример 2:
//        Вход:
//        N = 4, К = 2
//        arr[] = {1, 1, 1, 1}
//        Выход: 6 пар чисел
public class Task4 {
    public static void main(String[] args) {


       int n = new Task4Utils().UserInputArraySize();

       int [] ourArray = new Task4Utils().FillArray(n);
        for (int i = 0; i < ourArray.length; i++) {
            System.out.print(ourArray[i]+ " ");
        }
        System.out.println();

        int k = new Task4Utils().InputSampleNumber();
        System.out.println("Your sample number is " + k);

int numberOfPairs = new Task4Utils().PairOfNumbers(ourArray, k);
        System.out.println("Number of pairs " + numberOfPairs);



    }
}
