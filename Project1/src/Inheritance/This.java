package Inheritance;

public class This {  
	
	int a=20;
	
	public void demo() {
		
		int a=35;
		
		System.out.println(a);
		System.out.println(this .a);
		
		
	}
	public void basic() {
		int a=55;
		
		System.out.println(a);
		System.out.println(this.a);
	}
	
	
	public static void main(String[]args) {
	This x= new This();
	x.demo();
    x.basic();
	
}


}
