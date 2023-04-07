package Constructor;

public class Demo {
	
	
	int a;
	int b;
	int m;
	
	Demo(){   //user define without parameter
		
		a=20;
		b=60;
	}	
		Demo(int c,int d){  //user define with parameter
			a=c;
			b=d;
		}
	Demo(int c,int d,int e){
		a=c;
		b=d;
		m=e;
	}
	
	public void addition() {
		System.out.println(m+a+b);
		
	}
	public static void main(String[]arg) {
		
		Demo x= new Demo() ;
			x.addition();
			
			Demo y=new Demo();
			y.addition();
			
			Demo z=new Demo();
			z.addition();
	}
			
		
		
	}




