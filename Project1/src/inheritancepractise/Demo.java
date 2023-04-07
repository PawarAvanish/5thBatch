package inheritancepractise;

public class Demo extends Superc {
	
	
	public void Memo() {
		int a=45;
		int b=25;
		int c=a/b;
		
		System.out.println(c);
	
	}
	
	public static void main(String[]args) {
		
		Demo y=new Demo();
		
		y.Memo();
		y.Test();
		y.Basic();
		
		
	}

}
