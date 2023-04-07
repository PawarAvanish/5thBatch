package Statement;

public class Nestdif4 {
	
	public static void main(String[] arg) {
		{
		int age=60;
		

		
		if (age<=50)  
			System.out.println("you are young");
			
			if(age<=50)   {
				System.out.println("you are old");
				
			}
			else  
				if(age<=50)
				{
				System.out.println("you are old or not");
				
			}
			
		
			else  {
                  System.out.println("you are young or not");
			}
		}
	}
			}

	



