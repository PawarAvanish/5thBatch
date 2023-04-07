package InterfaceTesting;

public class Impliements  implements StaticInterface{
	
	public void Show() {
		System.out.println("Method show is running");
	}

	public static void main(String[]args) {
		
		Impliements c= new Impliements() ;
			
			
			c.Show()  ;
			
			//Implements.abc();
			
			StaticInterface.abc();
			
		}
	}
	

