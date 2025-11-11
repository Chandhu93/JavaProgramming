package string;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		String s ="abcdgfd345vr77";
		int sum=0;
		
		for(int i=0;i<s.length(); i++ ) {
			
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum= sum+ch-48;			// char return asci value, converting the character digit to its actual numeric value. 
			}
		}	
		System.out.println(sum);
		
	}

}
