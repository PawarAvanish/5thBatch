package InterfaceTesting;

public class Testdefault implements Default {
	
	
	public void Show() {
		
		System.out.println("Show method is running");
	}

	public void Mart() {
		
		System.out.println("All shops");
	}
	
	public static void main(String[]args) {
		
		Testdefault x=new Testdefault();
		
		x.Mart();
		x.Show();
	}
	
}

