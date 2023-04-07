package Array;

public class Swipping {

	
	public static void main(String[] args) {
		
		
		int a[]= {10,25,30,40,60,45};
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		
         for(int i=0;i<=(a.length/2);i++) {
        	 
        	 int c;
        	 c=a[i];
        	 a[i]=a[(a.length-1)-i];
        	 a[(a.length-1)-i]=c;
         } 
        	 System.out.println();
        	 
         
         

 		for(int i=0;i<=a.length-1;i++) {
 			
 			System.out.println(a[i]);  
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
