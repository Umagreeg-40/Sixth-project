package ternaryOperators;

public class Ternary {

	public static void main(String[] args)
	{
		int age=25;
		
		boolean condition=(age >= 18);

		System.out.println(condition);
		
		String major= "Person is major";
		String minor= "Person is minor";
		 
		System.out.println(condition ? major: minor);
	}

}
