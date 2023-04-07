package inheritancepractise;

   public class Concreteclass extends Abstractclass {
	
	public void name() {
		
		System.out.println("name method is running");
	}
	
	public void Memo() {
		
		System.out.println("Memo method of sub class running");
	}
	
         public static void	main(String[]args){
        	 
        	 Concreteclass b= new Concreteclass();
        	 
        	 b.name();
        	 b.Memo();
         }

}
