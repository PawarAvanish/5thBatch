package Package1;

public class ClassA {
	
	public int a=10;
	
	private int b=90;
	
	protected int c=50;
	
	int d=35;
	
	
	public static void main(String[]args) {
		
		
		ClassA  x=  new ClassA();
		
		System.out.println(x.a);   // calling variable with public access specifier
		System.out.println(x.b);   // calling variable with Private access specifier
		System.out.println(x.c);   // calling variable with protected access specifier
		System.out.println(x.d);   // calling variable with default access specifier

	}

}
