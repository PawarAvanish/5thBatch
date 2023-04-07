package Logicalnumber;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		
		int a=153;
		
		int add=0;
		
		
		for(int i=a;i>0;i=1/10) {
			
			int remainder=1%10;
			
			add=add+(remainder+remainder+remainder+remainder+remainder);
		}
		
		if(a==add) {
			System.out.println("Given number is armstrong ");
		}
		
		else {
			System.out.println("Given number is not Armstrong");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
