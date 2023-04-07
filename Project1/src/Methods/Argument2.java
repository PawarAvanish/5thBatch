package Methods;

public class Argument2 { 
	
	public  void Multiplication(int a, int b) { //non static method with argument
		int c=a*b;
		System.out.println("Multiplication="+c);
	}
	
	
    public static void addition() {
    	
    	int a=20;
    	int b=50;
    	int c=a+b;
    	
    
    	System.out.println(c);
    }
    
   public static void main(String[]args) {
	   addition();
	   
	   Argument2 x= new Argument2();
	 
	   x.Multiplication(40,20);
	  x.Multiplication(50,10);
	  x.Multiplication(20,10);

	  
	  
   }
}