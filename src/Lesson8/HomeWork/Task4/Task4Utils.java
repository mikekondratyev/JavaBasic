package Lesson8.HomeWork.Task4;

import java.util.Scanner;

public class Task4Utils {

    public int UserInputArraySize() {
        int arraySize;
        System.out.println("Input array size");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        return arraySize;
    }

    public int[] FillArray(int arraySize) {
        //  int  arraySize= UserInputArraySize();
        int k = arraySize;
        int[] ourArray = new int[k];

        for (int i = 0; i < k; i++) {
            ourArray[i] = (int) (Math.random() * 5 + 1);

        }
        //  System.out.println(ourArray.toString());
        return ourArray;
    }


    public int InputSampleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sample number");
        int sampleNumber = scanner.nextInt();
        return sampleNumber;
    }

    public int PairOfNumbers(int[] inputArray, int k) {
        int numberOfPairs = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length; j++) {

                if (inputArray[i] + inputArray[j] == k) {
                    numberOfPairs = numberOfPairs + 1;
                }

            }
        }
        return numberOfPairs;
    }

}