package Logicalforloop;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] arg) {
		
		Scanner demo=new Scanner (System.in);//scanner class object
		System.out.println("Enter the integer:");
		
		int value=demo.nextInt();//method
		
		System.out.println("you intered value is:");
		System.out.println();
		
		System.out.println("Enter the float");
		
		float value1=demo.nextFloat();
		
		System.out.println("you intered value is:"+"*");
		System.out.println();
		
		
		System.out.println("Enter the String:");
		
		String value2=demo.next();
     
		System.out.println("you intered value is:"+"*");

	}

}
