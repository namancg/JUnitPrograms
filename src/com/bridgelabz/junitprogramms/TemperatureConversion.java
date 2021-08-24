package com.bridgelabz.junitprogramms;
import java.util.*;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float celsius=0;
		float fahrenheit=0;
		System.out.println("Enter the option \n 1. Celsius to Farenheit \n 2. Farenheit to Celsius");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter Celsius");
			celsius = sc.nextFloat();
			float celsiusToFahrenheit= (celsius * (9/5))+32;
			System.out.println("Celsius converted to Fahrenheit is:"+celsiusToFahrenheit);
			break;
		case 2:
			System.out.println("Enter Fahrenheit");
			fahrenheit = sc.nextFloat();
			float fahrenheitToCelsius= (fahrenheit -32)*5/9;
			System.out.println("Celsius converted to Fahrenheit is:"+fahrenheitToCelsius);
		}
		

	}

}
