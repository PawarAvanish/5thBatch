package Logicalforloop;

public class Star1 {
	
	public static void main(String[] arg) {
		int star=1;    //  2   //3
		
		for( int i=1;i<=5;i++) {
			
			for(int j=1;j<=star;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			star++;
			}
		}
	}


