package javalargest;

import java.util.Scanner;

public class NestedIfClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int MarksObtained, passingMarks;
		char grade;
		passingMarks=40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inputs marks scored by you");
		MarksObtained= sc.nextInt();
		
		if(MarksObtained>=passingMarks)
		{
			if(MarksObtained>90)
				
				grade = 'A';
			else if (MarksObtained>75)
				
				grade = 'B';
			
            else if (MarksObtained>60)
				
				grade = 'C';
			
            else 
				
				grade = 'D';
		
			System.out.println("You passed the exam and your grade is " + grade);
		}
		
		else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		
	}

	}}
