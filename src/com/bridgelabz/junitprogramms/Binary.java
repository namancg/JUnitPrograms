package com.bridgelabz.junitprogramms;
import java.util.*;
public class Binary {

	public static int[] toBinary(int d) {

		String bin = "";
		while (d != 0) {
			bin = (d % 2) + bin;
			d = d/ 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		return stringToIntegerArray(bin);
	}

	static int[] stringToIntegerArray(String bin) {
		int[] binary = new int[bin.length()];
		System.out.println(bin);
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		System.out.println(binary);
		return binary;
	}
	
	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length/2;
		for (int i = 0; i < 4; i++) { 
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}	
	
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}	
	public static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
			temp = (int) Math.pow(2, i);
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		int binary[] = toBinary(sc.nextInt());
		System.out.print("The binary representation is ");
		showArray(binary);
		
		swapNibbles(binary);
		
		System.out.print("After swapping Nibbles");
		showArray(binary);
		
		int swapDecimal = toDecimal(binary);
		System.out.println("Decimal of swapped nibble is " + swapDecimal);

		if (powerOf2(swapDecimal)==true)
			
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");
		
		sc.close();
		
	}


}
