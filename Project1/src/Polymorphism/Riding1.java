package Polymorphism;

public class Riding1 extends Riding{
	
	public void Statement() {
		
		System.out.println("Method from sub class is runnihg");
	}

	
	public static void main(String[]args) {
	
		Riding1 x= new Riding1();
		x.Statement();
		
		
		Riding y= new Riding();
		y. Statement();
		
	}
}
