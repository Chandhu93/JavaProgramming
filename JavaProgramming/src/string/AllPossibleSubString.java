package string;

public class AllPossibleSubString {

	public static void main(String[] args) {
		String s= "sum";
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String s1= s.substring(i, j);	
				if(s1.length()>= 2) 
					System.out.println(s1);
			}
		}
	}
}
