package Logicaloperator;

public class logicaloperator3 {
	
	public static void main(String[] arg) {
		
		System.out.println((15>6) && (12>8));  //true
		
		System.out.println((15>6) && (12<8));  //false
		
		System.out.println((23>7) || (11<5));//true
		
		System.out.println((23<7)||(11<5));//false
		
		System.out.println(!(20==6));//true
		
		System.out.println(!(4>2));//false
		
	}

}
