package inheritancepractise;

public class Superc extends Super1 {
	
	
	

	public void Basic() {
		
		int a=20;
		int b=30;
		int c=a*b;
		
		System.out.println(c);
		
	}

	public static void main(String[]args) {
		
		Superc a= new Superc() ;
			
               a.Basic();
               a.Test();
		}
	}

