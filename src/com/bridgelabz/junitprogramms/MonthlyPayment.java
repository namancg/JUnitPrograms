package com.bridgelabz.junitprogramms;
import java.util.*;
import java.math.*;
public class MonthlyPayment {

	public static void main(String[] args) {
		float principalLoan=0,years=0,rateOfInterest=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal Amount, Rate of Interest and Years");
		principalLoan=sc.nextFloat();
		years=sc.nextFloat();
		rateOfInterest=sc.nextFloat();
		float n= 12*years;
		float r= rateOfInterest/(12*100);
		float payment = (float) (principalLoan * r/1-Math.pow((1+r), (-n)));
		System.out.println("The payment per month is :"+ payment);
	}

}
