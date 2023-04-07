package InterfaceTesting;

public interface Default {
	
	//Default method of interface
	//Default is a keyword not access specifier
	// mart method is by default public
	
	public default void Mart() {
		
		System.out.println("Shops");
	}

	
	public static void abc() {//complete static method
		
		System.out.println("Static method of interface is running");
	}
	public void Show();
	}

