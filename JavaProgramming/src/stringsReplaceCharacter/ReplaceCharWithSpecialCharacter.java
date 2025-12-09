package stringsReplaceCharacter;

public class ReplaceCharWithSpecialCharacter {

	public static void main(String[] args) {
		String s= "tommorrow"; //
		int count=0;
		char c= 'o';
		String res="";

		for(int i=0; i<s.length();i++) {

			if(s.charAt(i)== c) {
				count++;
				for(int j = 0; j<count; j++) {
					res = res+'$';
				}
			} else {
				res= res+s.charAt(i);
			}


		}
		System.out.println(res);	

	}

}
