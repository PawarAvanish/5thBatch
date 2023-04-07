package AbstractEncapsulation;

public class Encapsulation {

	
	private int a=40;
	private int b=20;
	
	Encapsulation(){
		
		a=30;
		b=10;
		
	}
	
	Encapsulation(int c,int d){
		a=c;
		b=d;
		
	}
	
	public void Basic() {
		int c=a+b;
		
		System.out.println(c);
	
	}
	
	public static void main(String[]args) {
		
		Encapsulation x= new Encapsulation();
		x.Basic();
	}
}
