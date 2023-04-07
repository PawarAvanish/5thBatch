package Methods;

public class basic3 { //non static method declare in same class
                     // and call in same class
	
	 public static void Demo() {//user define non static method declaration
		    System.out.println("Demo method running");
		    
	 }
		    public static void Test() {//user define  static method declaration
			    System.out.println("Testing method running");
		
		    }
		  public static void main(String[]arg){

		       basic2 x=new basic2() ; //object on non static

		   
		   
		    x.Demo();  //non static method calling same  class
		    Test(); // static method calling same class
		    
		  }	
}
