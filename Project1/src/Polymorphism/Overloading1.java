package Polymorphism;

public class Overloading1 {
	
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}
     public static  void addition(int a,int b,int c) {
    	 
    	 System.out.println(a+b+c);
  
     }
     public static void main(String[]args) {
    	 
    	Overloading1.addition(20,30);
    	Overloading1.addition(20,30,40);
     }
}

