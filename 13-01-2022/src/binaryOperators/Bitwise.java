package binaryOperators;

public class Bitwise {

	public static void main(String[] args) 
	{
		int a=10, b=5;
		
		System.out.println("&: "+(a&b));
		
		System.out.println("|: "+(a|b));
		
		/**
		 *   00001010
		 * & 00000101
		 * ------------
		 *   00000000 - 0  //ans is 0
		*/
		
		/**
		 *    00001010
		 *  | 00000101
		 *  ------------
		 *    00001111 - 15 //ans is 15
		 */
	}

}
