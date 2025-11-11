package string;

public class ExpandString {

	public static void main(String[] args) {

		String s = "a3b3c3a4c5d3s1";

		for(int i=0; i<s.length()-1; i=i+2) {

			int count = s.charAt(i+1)-48;
			char ch = s.charAt(i);
			for(int j=1; j<=count; j++) {
				System.out.print(ch);
			}

		}
	}	
}
