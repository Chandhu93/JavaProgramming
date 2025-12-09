package codes;

public class MaxMinPalindromeInStringArray {

	public static void main(String[] args) {
		String[] a= {"madam", "racecar","apple", "banana","noon" };
		String max=null;
		String min=null;
		
		for(int i=0; i<a.length;i++) {
			String s=a[i];
			String rev="";
			
			//String rev= new StringBuilder(s).reverse().toString();
			for(int j=s.length()-1;j>=0;j--) {
				rev= rev+s.charAt(j);
			}
			if(s.equals(rev) ) {
				if(max==null || s.compareTo(max) > 0) {
					max=s;
				}
				if(min==null || s.compareTo(min) < 0) {
					min=s;
				}
			}
		}
		System.out.println("Max Palindrome: "+ max);
		System.out.println("Min Palindrome: "+ min);
	}

}







