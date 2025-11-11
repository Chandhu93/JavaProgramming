package stringSentence;

public class ReverseWithoutReversingSpace {

	public static void main(String[] args) {
		
		String s= "Brace for an explosion";
		String s1 = s.replace(" ", "");
		int index=s1.length()-1;
		
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)==' ') {
				System.out.print(" ");
			} else 
				System.out.print(s1.charAt(index--));
			
		}
		
	}

}
