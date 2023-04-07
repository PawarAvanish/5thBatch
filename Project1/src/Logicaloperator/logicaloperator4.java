package Logicaloperator;

public class logicaloperator4 {
	
	public static void main(String[] arg) {
		
		System.out.println((10>5)&&(15>6));//true
		
		System.out.println((10>5)&&(15<6));//false
		
		System.out.println((10>5)||(15>6));//true
		
		System.out.println((10<5)||(15<6));//false
		
		System.out.println(!(10==5));//true
		
		System.out.println(!(6>3));//false
	}

}
