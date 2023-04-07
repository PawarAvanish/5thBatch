package Methods;

public class basic5 {         //calling from different class
	
	
	
	public static void main(String[]args) {
		
		basic2.Test();  //static method call from different class
		
             basic2 x=new basic2(); //object creation
	            x.Demo(); //non static method call different class
}

}
