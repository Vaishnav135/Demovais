package javalargest;

import java.util.Scanner;

public class IfElseClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int MarksObtained, passingMarks;
		
		passingMarks=40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inputs marks scored by you");
		MarksObtained= sc.nextInt();
		
		if(MarksObtained>=passingMarks)
		{
			System.out.println("You passed the exam.");
	}
	else {
	System.out.println("Unfortunately you failed to pass the exam.");
	}
		
		
	}

}
