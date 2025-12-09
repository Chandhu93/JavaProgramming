package string;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		String s="fihusdjioefij";
		char [] a = s.toCharArray();
		boolean[] b = new boolean[s.length()];

		for(int i=0; i<a.length; i++) {
			if(!b[i]){
				int count=0;
				for(int j=0; j<a.length; j++ ) {
					if(a[i] == a[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+"  .. "+count);
			}
		}
	}

}
