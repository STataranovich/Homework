package Task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[readLengthFromConsole(scan)];
        enterArrayFromConsole(arr);
        
        if (checkAsceding(arr)) {
            System.out.println("The sequece is accending");
        } else {
            System.out.println("The sequece is not accending");
        }


    }

    public static int readLengthFromConsole(Scanner scan) {
        int n = 0;
        System.out.print("Enter the length of Array, n: ");
        if (scan.hasNextInt()) {
            n = scan.nextInt();
        }
        return n;      
    }

    public static void enterArrayFromConsole(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a(" + (i+1) + ")=");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static boolean checkAsceding(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                result = true;
            } else {
                result = false;
                return result;
            }
        }
        return result;
    }
}