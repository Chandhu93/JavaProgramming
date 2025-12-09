package arrays;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int [] a = {9,8,7,6,5,4,3,2,1,0, 11,12};
		int[] b= {0,1,2,3,4,5,6,7,8,9};
		int max= Math.max(a.length, b.length);
		int [] c= new int[max];
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				c[i]=c[i]+ a[i];
			}
			if(i<b.length) {
				c[i]=c[i]+b[i];
			}
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
	}

}
