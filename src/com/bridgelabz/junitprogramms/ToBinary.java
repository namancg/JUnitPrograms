package com.bridgelabz.junitprogramms;
import java.util.*;
public class ToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n = sc.nextInt();
	        toBinary(n);
	}
	static void toBinary(int n)
    {
        int[] binaryNum = new int[32];
        int number = n;
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        System.out.print("Binary Representation of "+number+" is ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
