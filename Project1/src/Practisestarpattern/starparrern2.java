package Practisestarpattern;

public class starparrern2 {
	
	public static void main(String[] arg) {
		
		int row=5;
		
		for(int i=1;i<=5;i++) { //for i loop
		
		for (int k=4;k>=i;k--) {   //for space loop
			
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++) {     //for j loop column
				
				System.out.print("*");
				
			}   //end j loop
			
			System.out.println();
			}     //end i loop
		}
		
	}


