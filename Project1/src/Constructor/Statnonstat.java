package Constructor;

public class Statnonstat {
	
   
	
	static int p=10;
	int b=20;
	
	
	public static void main (String[]args) {
		System.out.println("static ref variable x="+p);
		
		Statnonstat x =new Statnonstat();
		System.out.println("nonstatic ref variable x="+x.b); //20
			
		Statnonstat y= new Statnonstat();
		System.out.println("nonstatic ref variable y="+ y.b);//20
		
		x.b=30;
		
		System.out.println("nonstatic ref variablex="+x.b);  //30
		System.out.println("nonstatic ref variable y="+ y.b);//20
		
		System.out.println("static ref variable x="+ x.p);//10
		System.out.println("static ref variable y="+y.p);//10
		
		x.p=40;
		System.out.println("static ref variable updated x="+ x.p);//40
		System.out.println("static ref variable updated y="+y.p);//40
		
			



		 
	}

}
