package stringSentence;

public class ReverseTheSequence {

	public static void main(String[] args) {
		
		String s ="Don't underestimate him, he had a powers beyound your compression";
		String[] str = s.split(" ");
		for(int i=str.length-1; i>=0 ;i--) {
			System.out.print(str[i]+" ");
		}
 	}
}
