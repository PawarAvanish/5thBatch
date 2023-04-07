package Inheritance;

public class Super1 extends Super { //a=25;
	
	int a=20;//global variable
	
	public void Test() {
		
		int a=75;//local variable
		
		System.out.println(a);//global variable from same class
		System.out.println(this.a);//global variable from super class
		System.out.println(super.a);//global variable from super class
	}

	public static void main(String[]args) {
		
		Super1 y=new Super1();
		
		y.Test();
	}
}
