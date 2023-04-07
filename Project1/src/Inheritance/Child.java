package Inheritance;

public class Child extends Parent {
	
	public void bike() {
		
		System.out.println("bike");
	}

	
	public static void main(String[]args) {
		
		Child  X= new Child();
		
		X.car();
		X.Money();
		X.Home();
		X.bike();
	}
}
