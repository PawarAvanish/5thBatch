package Logicalforloop;

public class Starpattern {

public static void main(String[] arg) {
		
		int Star=1;
		int Space=3;
		
		for(int i=1;i<=9;i++) { 
		
		for (int j=4;j<=Space;j++) { 
			
			System.out.print(" ");
		}
			for(int k=1;k<=Star;k++) {     
				
				System.out.print("*");
				
			System.out.println();
			    
		
		if(i<=3) {
			Space--;
			Star++;
		}
		else {
		Space++;
		Star --;
			
		}
			}
		}
}
}


		
		
	
