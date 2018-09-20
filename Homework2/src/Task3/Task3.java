package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        double r = 0, c, S;
        Scanner sc = new Scanner(System.in);

        System.out.println ("Введите радиус: ");
        if (sc.hasNextDouble()){
            r = sc.nextDouble();
        }

        c = 2 * 3.14 * r;
        S = 3.14 * r * r;

        System.out.println("Длина окружности: " + c + " Площадь круга: " + S);
    }
}
