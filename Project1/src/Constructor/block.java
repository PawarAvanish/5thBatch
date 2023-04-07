package Constructor;

public class block {
	
	static {
		System.out.println("static block is running");
		
	}
	{
			System.out.println("non static block is running");
			
		}
		public static void main(String[]arg) {
			System.out.println("main method running");
			
			block x=new block();
			
			
		}

	}
	


