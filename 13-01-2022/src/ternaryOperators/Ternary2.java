package ternaryOperators;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) 
	{ 
		int num;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s.nextInt();
		
		String positive = "The number is positive";
		String negative = "The number is negative";
		
		
		System.out.println(num>0 ? positive : negative);
		
		s.close();
		
	}

}
