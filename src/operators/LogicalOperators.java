package operators;

public class LogicalOperators {
	
	/*
	 * grade <= 55 = C
	 * * grade >= 65 = B
	 * * grade >= 75 = A
	 * * grade >= 85 = A+
	 */

	public static void main(String[] args) {
		LogicalOperators lo = new LogicalOperators();
		lo.logical(54);

	}
	
	
	public void logical(int studentGrade) {
		if (studentGrade <=55) {
			System.out.println("your grade is C >>>>" + studentGrade );
		} else if( (studentGrade>=56)&(studentGrade<=75)){
				System.out.println("your grade is B >>>"+ studentGrade  );
		}else {
			
			System.out.println("sorry something wrong");
		}
	}

}
