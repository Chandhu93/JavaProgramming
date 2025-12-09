package string;

public class CheckAStringIsPalindromWhitoutReverse {

	public static void main(String[] args) {
		String s="madam";
		s= s.toLowerCase();
		int index=s.length()-1;
		boolean isPlain=true;
		for(int i=0; i<s.length()/2; i++) {
			
			if(s.charAt(i)==s.charAt(index--)) {
				isPlain=false;
			}
		}
		if(isPlain) System.out.println(s+" is Palindrom");
		else System.out.println(s+" is not a Palindrom");
	}

}
