package operators;

public class RelationalOperators {
	
	/*
	 * if a studentGrade >= 55 
	 * 						55-65 is B
	 * 						65-80 is A
	 *  					85 is A+
	 */

	public static void main(String[] args) {
		RelationalOperators rp = new RelationalOperators();
		rp.studentGrade(66);
		
	}
	
	
	public void studentGrade(int studentGrade){
		
		
		if (studentGrade < 55) {
			System.out.println("sorry we can not accept " +studentGrade);
			
		}else if (studentGrade >= 55) {
			System.out.println("welcome to TEP " + studentGrade);
		}
		
		else {
			System.out.println("Student grade is not appropriate " + studentGrade);
		}
		
		
		
		
		
	}
	}


