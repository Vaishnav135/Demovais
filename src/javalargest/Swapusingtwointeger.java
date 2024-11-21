package javalargest;

public class Swapusingtwointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=1;
		int b=2;
		
		System.out.println("Before a" +a);
		System.out.println("Before b" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After a" +a);
		System.out.println("After b" +b);
		
	}

}
