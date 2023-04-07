package Casting;

public class Explicit {
	
	public static void main(String[]args) {
		
		double a=150;  //memory size 8 bytes
		System.out.println(a);
		
		int b=(int) a;  //memory size 4 bytes
		System.out.println(b);
		
		
		byte c=(byte) b;  // memory size 1 byte
		
		System.out.println(c);
		
	}

}
