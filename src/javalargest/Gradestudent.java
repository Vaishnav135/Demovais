package javalargest;

import java.util.Scanner;

public class Gradestudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
	
		
		 
		Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter Marks of students ");
		 x=in.nextInt();
		 
		 if(x<=35)
		 {
			 System.out.println("Candidate is fail");
		 }
		 
			 else if(x>=60)
			 {
				 System.out.println("Candidate pass with first class");
			 }
		 
			 else if(x>= 90)
			 {
			 System.out.println("Candidate pass with distinction");
			 }
		
		 
		 
			 }
		 
		
	}


