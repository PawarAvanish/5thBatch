package Constructor;

public class LocalGlobal {
	
	int a=30; //  global  variable
	
	public void Test () {
		
		int b=78;  //local variable
		
		System.out.println(b);//  calling local variable
		System.out.println(a);//  calling global variable

	}
	
	public void demo() {
		int c=20;// local variable
		
		System.out.println(c);//  calling local variable
		System.out.println(a);//  calling global 
		
		//System.out.println(b);//  local  variable from another method can be call
	}
	
	public static void main(String[]args) {
		
		LocalGlobal X=new LocalGlobal();
		
		X.Test();
		X.demo();



	}

}
