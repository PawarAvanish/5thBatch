package Methods;

public class basic1 {
	
	static int Demo() {  //user define method declaration
		
		int x=56;
		int y=45;
		int z=x+y;
		 return z;
		 
	}
        static String Test() {//user define method declaration
        	return "Testing";
        	
        }
       public static void main(String[]arg) {
    	   System.out.println("PQRST");
    	   
    	   int z=Demo(); //user define method int type data
    	   System.out.println(z);
    	   
    	   String a= Test();  //user define method String type data
    	   System.out.println(a);

       }
}

