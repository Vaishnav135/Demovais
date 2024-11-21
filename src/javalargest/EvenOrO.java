package javalargest;

import java.util.Scanner;

public class EvenOrO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a%2 ==0)
		{
			System.out.println("Number is Even");
			
			
		}
		else
			System.out.println("Number is odd");
	}

}
