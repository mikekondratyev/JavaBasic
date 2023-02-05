package Lesson8.HomeWork;
//3) Дан массив размера N-1 , который должен
// содержать только целые числа в диапазоне от 1 до N .
// Каждое число представлено в одном экземпляре,
// кроме одного числа. Найдите недостающий элемент.
//        Пример 1:
//        Вход:
//        N = 5
//        А[] = {1,2,3,5}
//        Ответ: 4
//        Пример 2:
//        Вход:
//        N = 10
//        А[] = {6,1,2,8,3,4,7,10,5}
//        Ответ: 9
public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        int[] etalonArray = new int[n];
        for (int i = 0; i < n; i++) {
            etalonArray[i] = i + 1;
            System.out.print(etalonArray[i]);

        }
        System.out.println();
        int[] inputArray = new int[]{1, 2, 4, 5};
        int sumEtalon = 0;
        int sumInput = 0;
        for (int j = 0; j < etalonArray.length; j++) {
            sumEtalon = sumEtalon+etalonArray[j];
        }
        for (int k = 0; k < inputArray.length; k++) {
            sumInput = sumInput+inputArray[k];
        }
        System.out.println(sumEtalon - sumInput);
    }
}
