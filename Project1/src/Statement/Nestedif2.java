package Statement;

public class Nestedif2 {
	
	public static void main(String[] arg) {
		{
		int no=777;
		
		
		if (no<=7)  
			System.out.println("singal digit nu");
			
			if(no<=77)   {
				System.out.println("double digit no");
				
			}
			else  
				if(no<=777)
				{
				System.out.println("triple digit no");
				
			}
			
		
			else  {
                  System.out.println("multiple digit no");
			}
		}
	}
			}

	


