package Inheritance;

public class Child1 extends Child{
	
	public void Cycle() {
		System.out.println("Cycle");
	}
	
	
	public static void main(String[]args) {
		
		Child1 X= new Child1();
		
		X.car();
		X.Home();
		X.Money();
		X.bike();
		X.Cycle();
	}

	
}
