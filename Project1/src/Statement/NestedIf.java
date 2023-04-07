package Statement;

public class NestedIf {
	
	public static void main(String[] arg) {

		String UN="ABC";
		String PWD="P@123";
		
		if (UN=="ABC")  {
			System.out.println("correct user name");
			
			if(PWD=="P@123")   {
				System.out.println("password is correct");
				System.out.println("Login Successful");
			}
			else  {
				System.out.println("password is incorrect");
				System.out.println("Login failed");
			}
			
		}
			else  {
                  System.out.println("incorrect username");
  				System.out.println("Login failed");
			}

			}
			
		}


