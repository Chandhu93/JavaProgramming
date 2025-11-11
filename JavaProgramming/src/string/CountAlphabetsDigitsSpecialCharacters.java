package string;

public class CountAlphabetsDigitsSpecialCharacters {

	public static void main(String[] args) {
		
		String s = "serfvc234sdcv%^&";
		int aplha=0, digit=0, specialChar=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
				digit++;
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
				aplha++;
			else
				specialChar++;
		}
		System.out.println("Digits: "+digit);
		System.out.println("Aplhabets: "+aplha);
		System.out.println("SpecialCharacter: "+specialChar);
	}

}
