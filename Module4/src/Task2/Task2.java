package Task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[readLengthFromConsole(scan)];
        createArray(arr);
        int total = calcSum(scan, arr);
        printRes(arr, total);
        scan.close();
    }

    public static int readLengthFromConsole(Scanner scan) {
        int l = 0;
        System.out.print("Enter the length of Array, l: ");
        if (scan.hasNextInt()) {
            l = scan.nextInt();
        }
        return l;      
    }

    public static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }

    public static int calcSum(Scanner scan, int[] arr) {
        int k = 0;
        System.out.print("Enter K: ");
        if (scan.hasNextInt()) {
            k = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void printRes(int[] arr, int total) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]=" + arr[i] + "; ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Total amount of % K = " + total);
    }

}