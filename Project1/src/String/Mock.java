package String;

public class Mock {
	
	public static void main(String[] args) {
		
		String a="priyanka";
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--) {
		
		
		reverse=reverse+a.charAt(i);
	}

	System.out.println(reverse)	;
	}

}
