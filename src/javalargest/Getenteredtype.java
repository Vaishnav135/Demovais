package javalargest;

import java.util.Scanner;

public class Getenteredtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;
		float b;
		String c;
		
		Scanner sc= new Scanner(System.in);	
		
		System.out.println("Enter a string");
		c= sc.nextLine();
		System.out.println("You Entered string"+c);
		
		
		System.out.println("Enter a number");
		a= sc.nextInt();
		System.out.println("You Entered Number"+a);
		
		System.out.println("Enter a float");
		b= sc.nextFloat();
		System.out.println("You Entered Number"+b);
		
		
		
	}

}
