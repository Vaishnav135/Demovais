package javalargest;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="TO LOVEFNEJFN NFJDNFJE", s2, s5, s6;
		int s3;
		String s4="sgsdgsdgs";
		
		
         s2 = s1.toLowerCase();
		
		System.out.println(s2);
		
		  s3 = s1.length();
		  System.out.println(s3);
		  
		 s5= s1.concat(s4);
		 System.out.println(s5);
		 
		s6=s1.replaceFirst(s5, s4);
		System.out.println(s6); 
		
	}

}
