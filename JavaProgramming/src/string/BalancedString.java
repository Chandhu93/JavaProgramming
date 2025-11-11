package string;

import java.util.ArrayList;

public class BalancedString {
	public static void main(String[] args) {
		
		String s ="{()[]}";
		ArrayList<Character> lst = new ArrayList();
		for(int i=0; i<s.length(); i++) {
			if(lst.size()>0 
					&& ((s.charAt(i)==')' && lst.get(lst.size()-1)=='(')
					|| (s.charAt(i)==']' && lst.get(lst.size()-1)=='[')
					|| (s.charAt(i)=='}' && lst.get(lst.size()-1)=='{'))) {
				lst.remove(lst.get(lst.size()-1));
			} else
				lst.add(s.charAt(i));
		} 
		if(lst.isEmpty())
			System.out.println(s+" is balanced");
		else
			System.out.println(s+" is not balanced");
	}
}





















