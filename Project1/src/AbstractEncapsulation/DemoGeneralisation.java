package AbstractEncapsulation;

public class DemoGeneralisation {
	
	
	public static void main(String[]args) {
		
		System.out.println("***************Specification of JIO**************************");
		
		Jio x= new Jio();
		x.Audiocalling();
		x.Textmessage();
		x.Internet();
		x.Newfeature();
		
		System.out.println("*************Specification of VI***************************");
		
		VI y= new VI();
		
		y.Audiocalling();
		y.Textmessage();
		y.Internet();
		
		System.out.println("******************Specification of BSNL*********************");
		
		BSNL z= new BSNL();
		z.Audiocalling();
		z.Textmessage();
		z.Internet();
		z.Newfeature2();
		
	}

}
