package binaryOperators;

public class Logical {

	public static void main(String[] args) 
	{
		int a=50, b=10;
		
		boolean validate=(a>=b);
		
		System.out.println("&&: "+((a>b) && (a>=b)));
		System.out.println("||: "+((a<b) || (a<=b)));
		System.out.println("!: "+!validate);
		
	}

}
