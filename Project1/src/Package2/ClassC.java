package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main(String[]args) {
		
		ClassA  x= new ClassA();
		
		System.out.println(x.a);   //calling variable with public access specifier
			//System.out.println(x.b);   //  private no access (out of scope)
	//System.out.println(x.c);   //protection no access (out of scope)
		//System.out.println(x.a);   // default out of scope



	}
	

}
