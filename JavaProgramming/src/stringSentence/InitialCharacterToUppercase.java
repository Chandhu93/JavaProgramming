package stringSentence;

public class InitialCharacterToUppercase {
	public static void main(String[] args) {
		
		String s = "Markandeya is once on a generation geninus, there won't another like him";
		String[] str= s.split(" ");
		for(int i=0; i<str.length; i++) {
			String s1 = str[i];
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
	}
}
