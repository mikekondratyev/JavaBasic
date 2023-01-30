package Lesson7.Homework;
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализуйте логический метод canBuy, возвращающий true / false
//        Значение этой переменной должно быть true, если хотя бы один
//        магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
public class Shops {

    public static void main(String[] args) {
        boolean isEdekaOpen=false;
        boolean isReweOpen=true;

        if (isEdekaOpen||isReweOpen){
            boolean canBuy = true;
            System.out.println("I can buy food, it is "+ canBuy);


        } else {
            boolean canBuy = false;

            System.out.println("I can buy food, it is "+ canBuy);

        }
    }

}
