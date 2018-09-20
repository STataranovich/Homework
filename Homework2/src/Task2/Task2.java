package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        double a = 0, b = 0, c = 0, x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextInt();
        }

        System.out.print("Введите b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.print("Введите c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }

        double temp;
        temp = Math.sqrt(b * b + 4 * a * c) + b;

        double d;
        d = 2 * a;

        double y;

        if (a != 0) {
            y = temp / d;
        } else {
            System.out.println("Знаменатель равен нулю.");
            y = Double.NaN;
        }

        double num2;
        num2 = a * a * a * c;

        x = y - num2 + b;

        System.out.println(" x = " + x);
    }
}