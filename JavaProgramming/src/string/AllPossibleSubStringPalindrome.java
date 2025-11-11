package string;

public class AllPossibleSubStringPalindrome {

	public static void main(String[] args) {
		String s= "aabbbaaaacddadsd";
		int lenght=0;
		String s3="";
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String s1= s.substring(i, j);	
				String s2 = new StringBuilder(s1).reverse().toString();
				if(s1.equals(s2) && lenght<s1.length()) {
					lenght=s1.length();
					s3=s1;
				}
			}	
		}
		System.out.println(s3);
	}
}
