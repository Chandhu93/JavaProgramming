package string;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		String s = "Mom";
		String rev = "";
		
		for (int i = s.length(); i>0; i++) {
			char c = s.charAt(i);
			rev+=c;
		}
		
		if(s.contentEquals(rev)) {
			System.out.println(s+" is Palinedrome");
		} else {
			System.out.println(s+ " not a Palinedrome");
		}
	}

}
