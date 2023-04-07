package Array;

import java.util.Arrays;

public class Ascdes {
	
	
	public static void main(String[] args) {
		
	int a[]= {10,35,20,60,56,45};
	
	
	System.out.println("************all info information************************");
	
	for(int i=0;i<=a.length-1;i++) {
		
		System.out.println(a[i]);
		
	}
	
	Arrays.sort(a);
	System.out.println("********************asending order*******************");
			
        for(int i=0;i<=a.length-1;i++) {
		
		System.out.println(a[i]);
}

       System.out.println("*******************************desending order**************");
       
       for(int i=a.length-1;i>=0;i--) {
    	   
    	   System.out.println(a[i]);
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
