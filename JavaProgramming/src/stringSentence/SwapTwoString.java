package stringSentence;

import java.util.Arrays;

public class SwapTwoString {
	public static void main(String[] args) {
		
		String s = "The man who can burn fire itself";
		String [] str=s.split(" ");
		String temp = str[str.length-1];
		str[str.length-1]= str[0];
		str[0] = temp;
		System.out.println(Arrays.toString(str));
		
	}

}
