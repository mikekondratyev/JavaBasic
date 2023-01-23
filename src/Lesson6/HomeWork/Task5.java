package Lesson6.HomeWork;
import java.util.Scanner;
public class Task5 {


        public static void main(String[] args) {

            int x ;
            int y;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи Х");
            x = scanner.nextInt();
            System.out.println("Введи У");
                    y = scanner.nextInt();

            if (x>y) {
                System.out.println(x);
            } else if (x<y){
                System.out.println(y);
            }

        }
    }


