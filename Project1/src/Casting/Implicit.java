package Casting;

public class Implicit {
	
	
	public static void main (String[]args) {
		
		byte a=79;// memory size 1 byte
		
		System.out.println(a);
		
		
		int b=a; // memory size 4 bytes
		
		System.out.println(b);
		
		double c=b; // memory size is 8 byte
		System.out.println(c);
	}

}
