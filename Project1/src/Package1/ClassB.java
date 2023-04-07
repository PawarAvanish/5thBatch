package Package1;

public class ClassB {
	
	
	public static void main(String[]arg) {
		
		
		ClassA x=  new ClassA();
		
		
		System.out.println(x.a);   //calling variable with public access
		//System.out.println(x.);   //calling variable with private access
		System.out.println(x.d);   //calling variable with protected access
		System.out.println(x.c);   //calling variable with default access


	}

}
