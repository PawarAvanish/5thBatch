package String;

public class WhiteSpace {
	
	public static void main(String[] args) {
		
		String  ad="pqrspppqtuv w xyz";
		
		int total=0;
		
		for(int i=0;i<=ad.length()-1;i++) {
			
			char a=ad.charAt(i);
			
			
			if(a=='p') {
				total++;
				
			}
		}
		
		
		System.out.println(total);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
