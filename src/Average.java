import java.util.Scanner;

public class Average {
        public static void main (String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите число 1");
            double a = scanner.nextDouble();
            System.out.println("Введите число 2");
            double b = scanner.nextDouble();
            System.out.println("Введите число 3");
            double c = scanner.nextDouble();

            System.out.println("Среднее арифметическое равно "+ (a+b+c)/3);
}
}