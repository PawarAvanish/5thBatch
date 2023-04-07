package Casting;

public class testupcasting {
	
	
	public static void main(String[]args) {
		
		System.out.println("****************Superclass method**************");
		
		upcasting x= new upcasting();
		x.Demo();
		x.get();
		x.superclass();
		
	
		System.out.println("****************Subclass method**************");
		
		upcasting1 y= new upcasting1();
		y.Demo();
         y.get();
         y.subclass();
         
         
         System.out.println("**************************cast method**********************");
         
         upcasting z= new upcasting1();
         
         z.Demo();
         z.get();
         z.superclass();
        
         upcasting1 up=(upcasting1) new upcasting1();
         
         up.Demo();
         up.get();
         up.superclass();
         up.subclass();
}
}
