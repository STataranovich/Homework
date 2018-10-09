package Task4;

import java.util.Arrays;
import java.util.Scanner;


public class Task4{
	
	public static int arrSize = 0;
	public static int[] arrayone;
	public static int[] arrayzero;
	
	public static void main(String[] args) {
		
		arrSize = inputSize();
		generateArrays(arrSize);
		fillArrays();
		zeroArrayOutput();
	}
	
	public static int inputSize() {
	Scanner scan = new Scanner(System.in);
		System.out.println("Plese enter array size: ");
		while(!scan.hasNextInt()) {
			scan.nextInt();
			System.out.println("Plese enter array size: ");
		} 
		arrSize = scan.nextInt();
		return arrSize;
	}
	
	public static void generateArrays (int arrl) {
		arrayone = new int[arrl];
		arrayzero = new int[1];
	}
	
	public static void fillArrays() {
		for(int i = 0; i<arrayone.length; i++) {
			arrayone[i] = (int)(Math.random() * 40);
		}
		System.out.println(Arrays.toString(arrayone));
	}

	public static void zeroArrayOutput() {
		boolean arrayzeroEmpty = true;
		for (int i = 0; i<arrayone.length; i++) {
			if(arrayone[i] == 0) {
				if(arrayzeroEmpty) {
					arrayzero[0] = i;
					arrayzeroEmpty = false;
	
				} else {
					int[] temp = new int [arrayzero.length + 1];
					System.arraycopy(arrayzero, 0, temp, 0, arrayzero.length);
					arrayzero = temp;
					arrayzero[arrayzero.length - 1] = i;
				}
			}
		}
		
		for (int im : arrayzero) {
			System.out.println(im);
		}
	}
	
}