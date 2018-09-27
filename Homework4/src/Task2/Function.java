package Task2;

import javax.swing.*;
import java.util.Scanner;

public class Function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = 0, a = 0, b = 0, h = 0;
        double f;

        System.out.println("Введите a: ");
        a = sc.nextInt();

        System.out.println("Введите b: ");
        b = sc.nextInt();

        System.out.println("Введите h: ");
        h = sc.nextInt();


        String leftAlignFormat = "| %-15s | %-4d |%n";
        System.out.println("+-----------------+---------------------------+%n");
        System.out.println("| Значение x     | F(x)  |");
        System.out.println("+-----------------+---------------------------+%n");
        for (x = a; x <= b; x += h) {
            f = (2 * Math.tan(x/2) + 1);
            System.out.printf("|%20f|%20f|%n", x, f);
            System.out.format("+-----------------+---------------------------+%n");
        }

    }
}
