package Lesson7.Homework;
//Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов.
//        Вы должны написать метод, который проверяет это устройство.
//        Ваша программа должна иметь переменные Temperature1 и Temperature2.
//        В результате он выводит сообщение true или false.
public class Temper {



    public static void main(String[] args) {
        double temp1=101;
        double temp2=99;

        if  ((temp1>100) && (temp2 < 100) )
        {
            System.out.println("false");
        }else {
            System.out.println("true");

        }

        }
    }


