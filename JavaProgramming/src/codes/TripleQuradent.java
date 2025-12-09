package codes;

public class TripleQuradent {
	public static void main(String[] args) {
		int[] a= {1,1,1,2,2,2,2,3,3,3,2};
		int count=1;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==a[i+1]) {
				count++;
			} else {
				if(count ==3) {
					System.out.println(a[i]+" is triple");

				} else if(count ==4) {
					System.out.println(a[i]+" is an quradent");
				}
				count = 1;    
			}
		}
		if(count ==3) {
			System.out.println(a[a.length-1]+" is triple");
		} else if(count ==4) {
			System.out.println(a[a.length-1]+" is an quradent");
		}
	}
}


