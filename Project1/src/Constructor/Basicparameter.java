package Constructor;

public class Basicparameter {   //user define constructor with and without parameter
	
	
	
	int a;
	int b;
	int m;
	String Name;
	String velocity;
	
	
	 Basicparameter(){  //user define without parameter
		 
		 a=20;
		 b=30;
		 
	 }
	 
	 Basicparameter(int c,int d,int i){//user define constructor with parameter
		 
		 a=c;
		 b=d;
		 m=i;
	 }
		 Basicparameter(int c,int d){   //user define constructor with parameter
			 
			 a=c;
			 b=d;
		 }
		 
		 Basicparameter(String abc,String Testing){
			 
			 Name=abc;
			 velocity=Testing;
		 }
		 
		 
		 public void addition() {  //non static method
			 
			System.out.println(m+a+b) ;
			int xyz;
			xyz=89;
		 }
		 
		 public void test() {
			 System.out.println(Name);
			 System.out.println(velocity);
		 }
		 
		 
		 public static void main(String[]args) {
			 
			 Basicparameter x=new Basicparameter();
			 
			 x.test();
			 x.addition();
			 x.addition();
			 
			 Basicparameter y = new Basicparameter(40,50);
			 y.addition();
			 
			 Basicparameter z = new Basicparameter(45,50,30);
			 z.addition();
			 
			 Basicparameter e= new 
					 Basicparameter("PNG","Automation");
			 
			 e.test();

			 
			 

			 
			 
			 
			 
			 
			 
			 
			 
		 }
	 }
	


