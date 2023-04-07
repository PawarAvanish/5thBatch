package Statement;

public class IFElseIfLadder {
	
	public static void main(String[] arg) {
		
		int marks=80;
		
		if(marks>=75) {
			System.out.println("student pass in Distinction");
			
		}
		
		else if(marks>=60) {
			System.out.println("student pass in first class");
		}
		
		else if(marks>=50) {
			System.out.println("student pass in second class");
			
		}
				else if (marks>=35) {
				System.out.println("Fail");
		}
	}

}
