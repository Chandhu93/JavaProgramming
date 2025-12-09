package codes;

import java.util.ArrayList;

public class PalindormeInStringArray {

	public static void main(String[] args) {
		String[] a= {"Madam", "racecar","apple", "banana","noon" };
		ArrayList<String> out= new ArrayList<>();
		for(String s: a) {
			String rev= new StringBuilder(s).reverse().toString();
			// Or use for loop to string
			if(s.equalsIgnoreCase(rev)) {
			out.add(s)	;
			}
		}
		System.out.println(out);
	}

}
