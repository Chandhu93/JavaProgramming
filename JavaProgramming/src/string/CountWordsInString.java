package string;

import java.util.HashMap;

class CountWordsInString {

	public static void main(String[] args) {
		String s= "hi how are you hi hello";
		String[] a= s.split(" ");
		boolean[] b= new boolean[a.length];
		for(int i=0; i<a.length;i++) {

			if(!(b[i])) {
				int count=0 ;

				for(int j=0; j<a.length; j++) {
					if(a[i].equals(a[j]) ) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+" --> "+ count);
			}
		}
	}
}

class CountOfWordUsingCollection{
	public static void main(String[] args) {
			String str= "hi how are you hi hello";
			String[] a= str.split(" ");
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			for(String s: a) {
				hs.put(s, hs.get(s)+1);
			}
			System.out.println(hs);
		}
		
	}


