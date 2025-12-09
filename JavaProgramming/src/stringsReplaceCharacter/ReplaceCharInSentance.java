package stringsReplaceCharacter;

public class ReplaceCharInSentance {

	public static void main(String[] args) {
		String s= "Java is a Progaramming Langauge";
		StringBuilder sd= new StringBuilder();
		s=s.toLowerCase();
		s=s.replaceAll("[aeiou]", "\\$"); // $ in regex is end of line
		System.out.println(s);
			
	}
}
