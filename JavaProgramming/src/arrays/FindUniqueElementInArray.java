package arrays;

import java.util.ArrayList;

public class FindUniqueElementInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,3,4,5,6,4,2,0,9};
		ArrayList<Integer> out = new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) {
			boolean unique= true;
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[i] == a[j] ) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println(a[i]); // without collection
				out.add(a[i]);
			}
		}
		System.out.println(out);
	}

}
