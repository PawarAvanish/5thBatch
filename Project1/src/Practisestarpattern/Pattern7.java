package Practisestarpattern;

public class Pattern7 {
	
	public static void main(String[]arg) {
		int space=4;
		int star=1;
		
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++)
				System.out.print("*");
			
			
			System.out.println();
			
			
			if(i<=4) {
				space--;
				star=star+2;
				
			}
			else {
				space++;
				star=star-2;
			}
		}
	}
}
	

