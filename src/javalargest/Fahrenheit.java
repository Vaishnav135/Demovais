package javalargest;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number i");
		temp = sc.nextInt();
		
		temp = ((temp-32)*5)/9;
		
		System.out.println("Temp in c is" +temp);
		
		
		
		
		
		
	}

}
