package javalargest;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		s1 =sc.nextLine();
		
		System.out.println("Enter the second string");
		s2 =sc.nextLine();
		
		if(s1.compareTo(s2) >0 )
		{
			System.out.println("First string is greater");
		}
		else if (s1.compareTo(s2)<0)
		{	
			System.out.println("Second string is greater");
		}
		
		else
		{	
			System.out.println("Both strings are equal.");
		}
			
	}

}
