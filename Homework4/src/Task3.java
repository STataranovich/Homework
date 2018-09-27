import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;

        System.out.print("Введите x: ");
        x = sc.nextDouble();

        calcY(x);

    }
    public static void calcY(double x){
        double fx;
        if (x <= -3)
        {    fx = Math.sqrt(9);
        }
        else {
            fx = 1 / (x * x + 1);
        }
        System.out.println("x = " + x + "; F(x)=" + fx);
    }
}
