package Lesson7.Homework.Exchange;

import java.util.Scanner;

//Реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input EUR amount");
        double eur = scanner.nextDouble();

        ExchangeUtil exchangeUtil= new ExchangeUtil();
        double usd = exchangeUtil.Ex(eur);
        System.out.println("In dollars = "+ usd);
    }

}
